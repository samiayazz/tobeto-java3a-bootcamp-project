package com.tobeto.java3a.bootcamp.dto.user.applicant.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginApplicantRequest {

    private String credential;
    private String password;
}
