package com.altun.ToDoList.repo;

import com.altun.ToDoList.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
