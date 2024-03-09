package com.tobeto.java3a.bootcamp.dto.user.applicant.request;

import com.tobeto.java3a.bootcamp.dto.user.common.request.CreateUserRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CreateApplicantRequest extends CreateUserRequest {

    private String about;
}
