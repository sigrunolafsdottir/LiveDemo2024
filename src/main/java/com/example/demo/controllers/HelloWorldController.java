package com.example.demo.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;

@RestController
public class HelloWorldController {


    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!!!!!!!!!!!!!";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam String firstName, @RequestParam String lastName){
        return "Hello "+firstName+" "+lastName;
    }

    @RequestMapping("/listgreeting")
    public String listDemo(@RequestParam List<Integer> myList){
        return "Hello "+myList;
    }

    @RequestMapping("/pathParamDemo/{param}")
    public String listDemo(@PathVariable String param){
        return "Hello "+param;
    }

    @RequestMapping("/htmlDemo")
    public String htmlDemo(){
        return "<H1>Hello</H1><br>Här kommer text och text<p>mer text";
    }


    @RequestMapping("/**") // This wildcard mapping catches all GET requests
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String error404() {
        return "Resource not found"; // You can return a custom error message here
    }

}
