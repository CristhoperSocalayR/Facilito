package com.example.sonaranalysisdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    // Error 4: Código duplicado
    public String processData(String data) {
        String result = data.trim().toUpperCase();
        return result + " - Processed!";
    }

    public String duplicateMethod(String data) {
        String result = data.trim().toUpperCase();  // Código duplicado
        return result + " - Duplicated!";
    }
}
