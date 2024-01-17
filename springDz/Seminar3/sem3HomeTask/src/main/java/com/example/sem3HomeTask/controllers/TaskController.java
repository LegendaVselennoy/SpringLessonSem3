package com.example.sem3HomeTask.controllers;

import com.example.sem3HomeTask.domain.User;
import com.example.sem3HomeTask.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks()
    {
          List<String>tasks=new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        return tasks;
    }


//    @GetMapping
//    public List<User> getAllTasks()
//    {
//        List<User>tasks=new ArrayList<>();
//        tasks.add();
//        tasks.add("filter");
//        tasks.add("calc");
//        return tasks;
//    }



    @GetMapping("/sort")//localhost:8080/tasks/sort
    public List<User> sortUsersByAge()
    {
        return service.sortUsersByAge(service.getRepository().getUsers());
    }


    @GetMapping("/filter/{age}")
    public List<User> filterByAge(@PathVariable int age){
        return service.filterUsersByAge(
                service.getRepository().getUsers(),age);
    }

     @GetMapping("/cal")
    public double calculateAverageAge(){
        return service.calculateAverageAge(service.getRepository().getUsers());
    }



    //метод filterUsersByAge
    //Подсказка  @GetMapping("/filter/{age}")

    //метод calculateAverageAge
    //Подсказка  @GetMapping("/calc")
}