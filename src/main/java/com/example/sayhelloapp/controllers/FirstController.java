package com.example.sayhelloapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Sir";
    }
    
    
    @GetMapping("/hello-sp1task2")
    public String sayHello2(){
        return "Hello sp1task2";
    }
}
