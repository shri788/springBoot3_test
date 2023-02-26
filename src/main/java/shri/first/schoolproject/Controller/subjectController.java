package shri.first.schoolproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.subject;
import shri.first.schoolproject.IService.ISubject;

@RestController
@RequestMapping("/subject")
public class subjectController {

    @Autowired
    private ISubject subjectRepo;
    @PostMapping("/add")
    public Mono<generalResponse> addSubject(@RequestBody subject subject){
        var result = subjectRepo.addSubject((subject));
        return result;
    }
}
