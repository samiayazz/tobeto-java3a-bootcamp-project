package com.tobeto.java3a.bootcamp.service.user;

import com.tobeto.java3a.bootcamp.dto.user.common.request.LoginUserRequest;
import com.tobeto.java3a.bootcamp.dto.user.employee.request.CreateEmployeeRequest;
import com.tobeto.java3a.bootcamp.dto.user.employee.request.EditEmployeeRequest;
import com.tobeto.java3a.bootcamp.model.user.Employee;
import com.tobeto.java3a.bootcamp.repository.user.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public List<Employee> get() {
        return employeeRepository.findAll();
    }

    public Employee getById(Integer id) {
        return employeeRepository.findById(id).get();
    }

    public boolean login(LoginUserRequest loginUserRequest) {
        // TODO check credential and password here
        return employeeRepository.findByEmailOrUserNameAndPassword(
                loginUserRequest.getCredential(),
                loginUserRequest.getPassword()
        ).isPresent();
    }

    public boolean create(CreateEmployeeRequest createEmployeeRequest) {
        Employee employee = modelMapper.map(createEmployeeRequest, Employee.class);
        return employeeRepository.save(employee) != null;
    }

    public boolean editById(Integer id, EditEmployeeRequest editEmployeeRequest) {
        Employee employee = modelMapper.map(editEmployeeRequest, Employee.class);
        employee.setId(id);
        return employeeRepository.save(employee) != null;
    }

    public boolean removeById(Integer id) {
        employeeRepository.deleteById(id);
        return true;
    }
}
