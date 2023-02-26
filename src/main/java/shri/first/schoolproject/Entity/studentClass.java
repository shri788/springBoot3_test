package shri.first.schoolproject.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "studentClasses")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class studentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long classId;

    @Column(nullable = false, updatable = false)
    private String className;

    @ManyToMany(mappedBy = "studentClasses", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<teacher> teachers = new HashSet<>();
}
