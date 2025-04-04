package com.example.sonaranalysisdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Error 1: Método largo
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        String greeting = "Hello, " + name;
        if (name.equalsIgnoreCase("admin")) {
            greeting = "Welcome, Admin!";
        }
        if (name.length() > 10) {
            greeting = "Hello, " + name.substring(0, 10);
        }
        // Error 2: Lógica no optimizada
        for (int i = 0; i < 1000; i++) {
            greeting += "!";
        }
        return greeting;
    }

    // Error 3: Variable no utilizada
    @GetMapping("/unused")
    public String unused() {
        String unusedVariable = "I am not used!";
        return "Unused variable function";
    }
}
