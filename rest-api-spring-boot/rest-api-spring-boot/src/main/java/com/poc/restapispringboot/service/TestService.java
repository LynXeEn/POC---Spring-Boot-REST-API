package com.poc.restapispringboot.service;

import com.poc.restapispringboot.dto.TestDTO;
import org.springframework.stereotype.Component;

@Component
public interface TestService {
    public TestDTO getName();
}
