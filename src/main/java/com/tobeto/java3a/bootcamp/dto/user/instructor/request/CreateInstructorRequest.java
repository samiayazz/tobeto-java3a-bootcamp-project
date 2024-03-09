package com.tobeto.java3a.bootcamp.dto.user.instructor.request;

import com.tobeto.java3a.bootcamp.dto.user.common.request.CreateUserRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CreateInstructorRequest extends CreateUserRequest {

    private String companyName;
}
