package com.spring.messaging_app.controller;

import org.springframework.web.bind.annotation.*;
import com.spring.messaging_app.dto.User;

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

    // UC4: Accepting firstName and lastName from request body
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
