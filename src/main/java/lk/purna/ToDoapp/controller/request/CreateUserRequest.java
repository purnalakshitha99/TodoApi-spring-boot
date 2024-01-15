package lk.purna.ToDoapp.controller.request;

import lombok.Data;

@Data
public class CreateUserRequest {

    private Long id;
    private String name;
    private String address;
}
