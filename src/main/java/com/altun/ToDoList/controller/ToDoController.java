package com.altun.ToDoList.controller;

import com.altun.ToDoList.model.TodoItem;
import com.altun.ToDoList.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")

public class ToDoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    @PostMapping
    public TodoItem save(@NonNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@NonNull @RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }

    @DeleteMapping(value = "/todo/{id}")
    public void delete (@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
