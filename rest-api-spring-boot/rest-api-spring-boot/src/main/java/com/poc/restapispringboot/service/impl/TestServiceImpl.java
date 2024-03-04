package com.poc.restapispringboot.service.impl;

import com.poc.restapispringboot.controller.TestController;
import com.poc.restapispringboot.dto.TestDTO;
import com.poc.restapispringboot.repository.TestRepository;
import com.poc.restapispringboot.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private static Logger logger = LoggerFactory.getLogger(TestController.class);
    private TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
    @Override
    public TestDTO getName() {
        logger.info("Calling TestServiceImpl getName() method");
        return testRepository.getName();
    }
}
