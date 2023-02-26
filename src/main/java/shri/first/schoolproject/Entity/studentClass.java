package shri.first.schoolproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "studentClasses")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class studentClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long classId;

    @Column(nullable = false)
    private String className;
}
