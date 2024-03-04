package com.poc.restapispringboot.service.impl;

import com.poc.restapispringboot.dto.TestDTO;
import com.poc.restapispringboot.repository.TestRepository;
import com.poc.restapispringboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
    @Override
    public TestDTO getName() {
        return testRepository.getName();
    }
}
