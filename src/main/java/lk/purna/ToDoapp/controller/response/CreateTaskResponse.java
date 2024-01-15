package lk.purna.ToDoapp.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateTaskResponse {
    private Long id;
    private String description;
    private String type;
}
