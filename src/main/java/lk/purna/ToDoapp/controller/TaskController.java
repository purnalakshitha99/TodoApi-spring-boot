package lk.purna.ToDoapp.controller;

import lk.purna.ToDoapp.controller.request.CreateTaskRequest;
import lk.purna.ToDoapp.controller.response.CreateTaskResponse;
import lk.purna.ToDoapp.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TaskController {
    private TaskService taskService;


    @PostMapping("/users/{user-id}/tasks")
    public CreateTaskResponse add(@PathVariable("user-id")Long userId, @RequestBody CreateTaskRequest createTaskRequest){
        System.out.println("task add");
      return   taskService.add(userId,createTaskRequest);

    }
}
