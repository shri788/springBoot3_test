package shri.first.schoolproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.teacher;
import shri.first.schoolproject.IService.ITeacher;

@RestController
@RequestMapping("/teacher")
public class teacherController {
    @Autowired
    private ITeacher teacherRepo;

    @PostMapping("/add")
    public Mono<generalResponse> addTeacher(@RequestBody teacher teacher) {
        return teacherRepo.addTeacher((teacher));
    }

    @GetMapping("/byId/{teacherId}")
    public ResponseEntity<Object> getTeacherById(@PathVariable Long teacherId){

        return ResponseEntity.ok(teacherRepo.getTeacherById((teacherId)));
    }
}
