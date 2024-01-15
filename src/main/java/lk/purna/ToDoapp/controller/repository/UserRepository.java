package lk.purna.ToDoapp.controller.repository;

import lk.purna.ToDoapp.controller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
