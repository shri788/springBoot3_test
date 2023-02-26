package shri.first.schoolproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.studentClass;
import shri.first.schoolproject.IService.IStudentClass;

@RestController
@RequestMapping("/class")
public class classController {

    @Autowired
    private IStudentClass classRepo;

    @PostMapping("/add")
    public Mono<generalResponse> addClass(@RequestBody studentClass stdClass) {
        return classRepo.addStudentClass((stdClass));
    }
}
