package com.example.backend.mapper;

import com.example.backend.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    TestDto getTestMessage();
}
