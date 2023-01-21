package com.projecttodo.TodoList.repository;

import com.projecttodo.TodoList.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
