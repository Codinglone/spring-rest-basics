package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/app")
public class HelloController {
    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello There!!";
    }

    @RequestMapping("/cars")
    public String cars(){
        return "Volvo, Honda";
    }

}