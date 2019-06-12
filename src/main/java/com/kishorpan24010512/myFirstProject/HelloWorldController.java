package com.kishorpan24010512.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController

public class HelloWorldController {
    // specify route method for this method

    @GetMapping("/")

    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello/{name}")

    public String getHelloToMe(@PathVariable String name){
        return "Hello, " + name;
    }
    //https://www.baeldung.com/java-string-title-case

    @GetMapping("/capitalize/{text}")
    public static String getCapitals(@PathVariable String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        StringBuilder converted = new StringBuilder();

        boolean convertNext = true;
        for (char chars : text.toCharArray()) {
            if (Character.isSpaceChar(chars)) {
                convertNext = true;

            } else if (convertNext) {
                chars = Character.toUpperCase(chars);
                convertNext = true;

            } else {
                chars = Character.toLowerCase(chars);
            }
            converted.append(chars);
        }

        return converted.toString();
    }
    @GetMapping("/reverse/{input}")

    public static String reverseString(@PathVariable String input){
        List< String > words = Arrays.asList( input.split( " " ));
        Collections.reverse( words );
        String reverse = words.stream().collect( Collectors.joining( " " ));
        return reverse;

    }

}
