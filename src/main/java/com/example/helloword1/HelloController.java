package com.example.helloword1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloAWSteste")
    public String helloWorld() {
        return "Hello, World AWS TESTE!";
    }
}

