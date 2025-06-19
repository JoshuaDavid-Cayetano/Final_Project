package com.example.microservicesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SampleDataController {

    @GetMapping("/api/micro/data")
    public Map<String, Object> getData() {
        return Map.of(
                "message", "Data from microservice!",
                "timestamp", System.currentTimeMillis()
        );
    }
}
