package com.asyraf.library_api.service;

import com.asyraf.library_api.dto.test.TestResponse;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestResponse getAll() {
        return TestResponse.builder()
            .nama("Asyraf")
            .usia(22)
            .build();
    }

}
