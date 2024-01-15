package lk.purna.ToDoapp.controller;

import lk.purna.ToDoapp.controller.request.CreateUserRequest;
import lk.purna.ToDoapp.controller.response.CreateUserResponse;
import lk.purna.ToDoapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping("/users")
    public CreateUserResponse add(@RequestBody CreateUserRequest createUserRequest){
        System.out.println("create User");

       return userService.add(createUserRequest);

    }
}
