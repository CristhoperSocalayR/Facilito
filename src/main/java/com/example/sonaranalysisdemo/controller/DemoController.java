package com.example.sonaranalysisdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final String EXCLAMATIONS = "!".repeat(1000);

    /**
     * Devuelve un saludo con el nombre proporcionado. 
     * Si es "admin", el saludo es especial. 
     * Añade 1000 signos de exclamación.
     */
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        if ("admin".equalsIgnoreCase(name)) {
            return "Welcome, Admin!" + EXCLAMATIONS;
        }
        String shortName = name.length() > 10 ? name.substring(0, 10) : name;
        return "Hello, " + shortName + EXCLAMATIONS;
    }

    /**
     * Devuelve un mensaje indicando que no se usa ninguna variable.
     */
    @GetMapping("/unused")
    public String unused() {
        return "Unused variable function";
    }
}
