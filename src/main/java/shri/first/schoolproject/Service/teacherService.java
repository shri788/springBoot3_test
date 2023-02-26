package shri.first.schoolproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.teacher;
import shri.first.schoolproject.IService.ITeacher;
import shri.first.schoolproject.Repository.teacherRepository;
import reactor.core.publisher.Mono;

@Service
public class teacherService implements ITeacher {

    @Autowired
    private teacherRepository teacherRepo;

    public Mono<generalResponse> addTeacher(teacher teacher) {
        teacherRepo.save(teacher);
        return Mono.just(generalResponse.builder().action("success")
                .message("Teacher successfully created").build());
    }

    public teacher getTeacherById(Long teacherId) {
        return teacherRepo.findById(teacherId)
                        .stream().findFirst().orElse(null);
    }
}
