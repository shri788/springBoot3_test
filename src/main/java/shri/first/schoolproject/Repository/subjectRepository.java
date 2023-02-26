package shri.first.schoolproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shri.first.schoolproject.Entity.subject;

public interface subjectRepository extends JpaRepository<subject, Long> {
}
