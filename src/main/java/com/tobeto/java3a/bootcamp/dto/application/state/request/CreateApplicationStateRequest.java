package com.tobeto.java3a.bootcamp.dto.application.state.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateApplicationStateRequest {

    private String name;
}
