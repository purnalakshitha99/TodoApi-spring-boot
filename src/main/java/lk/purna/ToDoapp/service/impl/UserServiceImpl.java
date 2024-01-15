package lk.purna.ToDoapp.service.impl;

import lk.purna.ToDoapp.controller.model.User;
import lk.purna.ToDoapp.controller.repository.UserRepository;
import lk.purna.ToDoapp.controller.request.CreateUserRequest;
import lk.purna.ToDoapp.controller.response.CreateUserResponse;
import lk.purna.ToDoapp.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public CreateUserResponse add(CreateUserRequest createUserRequest){

        User user = new User();

        user.setAddress(createUserRequest.getAddress());
        user.setName(createUserRequest.getName());

        userRepository.save(user);

        CreateUserResponse createUserResponse = CreateUserResponse.builder().id(user.getId()).name(user.getName()).address(user.getAddress()).build();

        return createUserResponse;
    }
}
