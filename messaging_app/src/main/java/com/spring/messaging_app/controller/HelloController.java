package com.spring.messaging_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // UC1: Default message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // UC2: Accepting name as a query parameter
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC3: Accepting name as a path variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}