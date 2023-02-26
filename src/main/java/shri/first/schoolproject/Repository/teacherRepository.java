package shri.first.schoolproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shri.first.schoolproject.Entity.teacher;

public interface teacherRepository extends JpaRepository<teacher, Long> {
}
