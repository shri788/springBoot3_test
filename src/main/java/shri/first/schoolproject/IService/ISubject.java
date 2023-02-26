package shri.first.schoolproject.IService;

import reactor.core.publisher.Mono;
import shri.first.schoolproject.DTO.generalResponse;
import shri.first.schoolproject.Entity.subject;

public interface ISubject {
    Mono<generalResponse> addSubject(subject subject);
}
