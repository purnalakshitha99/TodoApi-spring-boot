package lk.purna.ToDoapp.controller.repository;

import lk.purna.ToDoapp.controller.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
