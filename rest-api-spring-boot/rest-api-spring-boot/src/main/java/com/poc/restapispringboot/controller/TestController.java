package com.poc.restapispringboot.controller;

import com.poc.restapispringboot.dto.TestDTO;
import com.poc.restapispringboot.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);
    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public TestDTO getName(){
        logger.info("Calling TestController");
        return testService.getName();
    }
}
