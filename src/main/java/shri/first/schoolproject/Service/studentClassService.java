package shri.first.schoolproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.studentClass;
import shri.first.schoolproject.IService.IStudentClass;
import shri.first.schoolproject.Repository.studentClassRepository;

@Service
public class studentClassService implements IStudentClass {

    @Autowired
    private studentClassRepository classRepo;

    public Mono<generalResponse> addStudentClass(studentClass stdClass){
        classRepo.save((stdClass));
        return Mono.just(generalResponse.builder().action("success")
                .message("student class created successfully").build());
    }
}
