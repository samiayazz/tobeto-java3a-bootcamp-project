package com.tobeto.java3a.bootcamp.dto.user.instructor.request;

import com.tobeto.java3a.bootcamp.dto.user.common.request.EditUserRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EditInstructorRequest extends EditUserRequest {

    private String companyName;
}
