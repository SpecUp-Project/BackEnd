package com.example.backend.service;

import com.example.backend.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestMapper testMapper;
    public TestService(TestMapper testMapper){
        this.testMapper = testMapper;
    }

    public String getMessageFromDb() {
        return testMapper.getTestMessage().getMessage();
    }
}