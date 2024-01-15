package lk.purna.ToDoapp.service.impl;

import lk.purna.ToDoapp.controller.model.Task;
import lk.purna.ToDoapp.controller.model.User;
import lk.purna.ToDoapp.controller.repository.TaskRepository;
import lk.purna.ToDoapp.controller.repository.UserRepository;
import lk.purna.ToDoapp.controller.request.CreateTaskRequest;
import lk.purna.ToDoapp.controller.response.CreateTaskResponse;
import lk.purna.ToDoapp.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;
    private UserRepository userRepository;

    public CreateTaskResponse add(Long userId,CreateTaskRequest createTaskRequest){

        Optional<User> userOptional = userRepository.findById(userId);

        if (userOptional.isPresent()){

            User user = userOptional.get();

            Task task = new Task();

            task.setType(createTaskRequest.getType());
            task.setDescription(createTaskRequest.getDescription());

            task.setUser(user);

            taskRepository.save(task);

           CreateTaskResponse createTaskResponse = CreateTaskResponse.builder().id(task.getId()).type(task.getType()).description(task.getDescription()).build();

           return createTaskResponse;
        }
         else {
             return null;
        }

    }
}
