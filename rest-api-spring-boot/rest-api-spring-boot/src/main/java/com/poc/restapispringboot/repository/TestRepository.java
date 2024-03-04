package com.poc.restapispringboot.repository;

import com.poc.restapispringboot.dto.TestDTO;
import org.springframework.stereotype.Component;

@Component
public class TestRepository {

    public TestDTO getName() {
        TestDTO testDTO = new TestDTO();
        testDTO.setName("Test");
        return testDTO;
    }

}
