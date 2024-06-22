package com.asyraf.library_api.dto.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TestResponse {
    private String nama;
    private Integer usia;
}
