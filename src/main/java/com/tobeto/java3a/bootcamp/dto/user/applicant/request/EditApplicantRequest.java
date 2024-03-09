package com.tobeto.java3a.bootcamp.dto.user.applicant.request;

import com.tobeto.java3a.bootcamp.dto.user.common.request.EditUserRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EditApplicantRequest extends EditUserRequest {

    private String about;
}
