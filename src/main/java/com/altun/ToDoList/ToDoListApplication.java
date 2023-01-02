package com.altun.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ToDoListApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ToDoListApplication.class, args);
    }

}
