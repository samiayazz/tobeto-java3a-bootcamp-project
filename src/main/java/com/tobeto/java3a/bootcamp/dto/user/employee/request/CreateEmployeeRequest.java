package com.tobeto.java3a.bootcamp.dto.user.employee.request;

import com.tobeto.java3a.bootcamp.dto.user.common.request.CreateUserRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CreateEmployeeRequest extends CreateUserRequest {

    private String position;
}
