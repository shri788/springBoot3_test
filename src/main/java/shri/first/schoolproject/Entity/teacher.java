package shri.first.schoolproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teachers")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;

    @Column(nullable = false)
    private String teacherName;

    @Column(name = "subject_id",insertable = false, updatable = false)
    private Long subjectId;

    @OneToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "subject_id")
    private subject subject;

//    @OneToMany
//    @JoinColumn(name="className")
//    private String className;
//    private List<studentClass> studentClassList = new ArrayList<studentClass>();
}
