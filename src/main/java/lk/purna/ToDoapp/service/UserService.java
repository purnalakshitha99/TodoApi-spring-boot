package lk.purna.ToDoapp.service;


import lk.purna.ToDoapp.controller.request.CreateUserRequest;
import lk.purna.ToDoapp.controller.response.CreateUserResponse;

public interface UserService {

    CreateUserResponse add(CreateUserRequest createUserRequest);
}
