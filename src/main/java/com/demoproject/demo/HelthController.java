package com.demoproject.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelthController {

    @GetMapping("/")
    public String startPage(){
        return "Welcome to home page";
    }

    @GetMapping("/health")
    public String health(){
        return "running good !";

    }
    
}
