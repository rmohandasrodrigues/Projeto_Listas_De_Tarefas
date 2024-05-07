package com.connectsistemas.todolist.repository;

import com.connectsistemas.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long> {
}
