package com.tobeto.java3a.bootcamp.dto.user.common.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public abstract class EditUserRequest {

    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String nationalId;

    private String userName;
    private String email;
    private String password;
}
