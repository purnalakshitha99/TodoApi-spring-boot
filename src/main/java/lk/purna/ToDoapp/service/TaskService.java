package lk.purna.ToDoapp.service;

import lk.purna.ToDoapp.controller.request.CreateTaskRequest;
import lk.purna.ToDoapp.controller.response.CreateTaskResponse;

public interface TaskService {

    CreateTaskResponse add(Long userId,CreateTaskRequest createTaskRequest);
}
