package shri.first.schoolproject.IService;

import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.teacher;

public interface ITeacher {
    Mono<generalResponse> addTeacher(teacher teacher);

    teacher getTeacherById(Long teacherId);
}
