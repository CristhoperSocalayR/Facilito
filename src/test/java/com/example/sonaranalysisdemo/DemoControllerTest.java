package com.example.sonaranalysisdemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(DemoController.class)  // Esto configura el entorno para probar solo el controlador
class DemoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greetAdminTest() throws Exception {
        mockMvc.perform(get("/greet")
                        .param("name", "admin"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Welcome, Admin!" + "!".repeat(1000)));
    }

    @Test
    void greetOtherUserTest() throws Exception {
        mockMvc.perform(get("/greet")
                        .param("name", "JohnDoe"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello, JohnDoe" + "!".repeat(1000)));
    }
}
