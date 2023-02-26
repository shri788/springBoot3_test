package shri.first.schoolproject.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.subject;
import shri.first.schoolproject.IService.ISubject;
import shri.first.schoolproject.Repository.subjectRepository;

@Service
public class subjectService implements ISubject {

    @Autowired
    private subjectRepository subjectRepo;
    public Mono<generalResponse> addSubject(subject subject) {
        subjectRepo.save(subject);
        return Mono.just(generalResponse.builder().action("success")
                .message("successfully created").build());
    }
}
