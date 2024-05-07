package com.connectsistemas.todolist.controller;

import com.connectsistemas.todolist.entity.Todo;
import com.connectsistemas.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/create")
    List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
    }

    @GetMapping("/list")
    List<Todo> list(){
        return todoService.list();
    }

    @PutMapping("/update")
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);

    }

    @DeleteMapping("/delete/{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
