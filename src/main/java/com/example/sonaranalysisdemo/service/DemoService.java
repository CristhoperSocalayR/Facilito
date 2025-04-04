package com.example.sonaranalysisdemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    
    //Transforma el texto a mayúsculas y elimina los espacios al principio y final.
    
    private String transform(String data) {
        return data.trim().toUpperCase();
    }

  
    //Procesa los datos y les agrega el sufijo " - Processed!".
    
    public String processData(String data) {
        return transform(data) + " - Processed!";
    }

   
    //Duplica los datos y les agrega el sufijo " - Duplicated!".
     
    public String duplicateMethod(String data) {
        return transform(data) + " - Duplicated!";
    }
}
