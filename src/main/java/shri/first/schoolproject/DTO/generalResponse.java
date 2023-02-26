package shri.first.schoolproject.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class generalResponse {
    private String action;

    private String message;
}
