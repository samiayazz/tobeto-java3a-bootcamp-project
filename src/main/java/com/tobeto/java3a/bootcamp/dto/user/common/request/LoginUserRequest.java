package com.tobeto.java3a.bootcamp.dto.user.common.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginUserRequest {

    private String credential;
    private String password;
}
