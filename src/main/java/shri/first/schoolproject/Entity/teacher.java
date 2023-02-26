package shri.first.schoolproject.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "teachers")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long teacherId;

    @Column(nullable = false)
    private String teacherName;

    @OneToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private subject subject;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JsonManagedReference
    @JoinTable(
            name = "teacher_studentClass",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id"))
    private Set<studentClass> studentClasses = new HashSet<>();
}
