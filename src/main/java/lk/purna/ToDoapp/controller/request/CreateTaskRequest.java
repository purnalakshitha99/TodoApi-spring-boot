package lk.purna.ToDoapp.controller.request;

import lombok.Data;

@Data

public class CreateTaskRequest {

    private Long id;
    private String description;
    private String type;
}
