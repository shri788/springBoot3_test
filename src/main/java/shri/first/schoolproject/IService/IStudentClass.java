package shri.first.schoolproject.IService;

import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.studentClass;

public interface IStudentClass {
    Mono<generalResponse> addStudentClass(studentClass stdClass);
}
