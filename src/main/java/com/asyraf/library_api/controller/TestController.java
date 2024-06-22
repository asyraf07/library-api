package com.asyraf.library_api.controller;

import com.asyraf.library_api.dto.test.TestResponse;
import com.asyraf.library_api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public ResponseEntity<TestResponse> hello() {
        return ResponseEntity.ok(testService.getAll());
    }

    @GetMapping("/hi")
    public ResponseEntity<String> hi() {
        return ResponseEntity.ok("Hi");
    }

}
