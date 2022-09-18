package com.example.demo;

import com.example.demo.model.ingredient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class main {

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("api")
    public List<ingredient> getAll() {
        return List.of(new ingredient("1", "pasta", 1000), new ingredient("2", "pomodoro", 2000));
    }

}
