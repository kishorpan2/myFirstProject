package com.kishorpan24010512.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class HelloWorldController {
    @GetMapping("/hello/name")
    public String getHelloToMe(@PathVariable String name,@PathVariable String from){
        return "Hello, " + name + "from ";
    }

}
