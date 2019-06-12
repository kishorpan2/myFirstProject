package com.kishorpan24010512.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    // specify route method for this method

    @GetMapping("/")

    public String getHelloWorld(){
        return "Hello World " ;
    }

    @GetMapping("/hello/{name}")

    public String getHelloToMe(@PathVariable String name){
        return "Hello, " + name;
    }

}
