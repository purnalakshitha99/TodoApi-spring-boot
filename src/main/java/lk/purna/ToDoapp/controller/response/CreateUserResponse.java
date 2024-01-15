package lk.purna.ToDoapp.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserResponse {

    private Long id;
    private String name;
    private String address;
}
