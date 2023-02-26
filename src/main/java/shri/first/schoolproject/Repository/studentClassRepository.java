package shri.first.schoolproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shri.first.schoolproject.Entity.studentClass;

public interface studentClassRepository extends JpaRepository<studentClass, Long> {
}
