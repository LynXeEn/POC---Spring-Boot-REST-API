package com.poc.restapispringboot.controller;

import com.poc.restapispringboot.dto.TestDTO;
import com.poc.restapispringboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public TestDTO getName(){
        return testService.getName();
    }
}
