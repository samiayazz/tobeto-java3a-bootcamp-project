package com.tobeto.java3a.bootcamp.controller.user;

import com.tobeto.java3a.bootcamp.dto.user.common.request.LoginUserRequest;
import com.tobeto.java3a.bootcamp.dto.user.employee.request.CreateEmployeeRequest;
import com.tobeto.java3a.bootcamp.dto.user.employee.request.EditEmployeeRequest;
import com.tobeto.java3a.bootcamp.model.user.Employee;
import com.tobeto.java3a.bootcamp.service.user.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> get() {
        return employeeService.get();
    }

    @GetMapping("/{id}")
    public Employee getById(Integer id) {
        // TODO check id here
        return employeeService.getById(id);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody LoginUserRequest loginUserRequest) {
        // TODO check credential and password here
        return employeeService.login(loginUserRequest);
    }

    @PostMapping("/create")
    public boolean create(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
        // TODO check user here
        return employeeService.create(createEmployeeRequest);
    }

    @PutMapping("/edit/{id}")
    public boolean editById(@PathVariable Integer id, @RequestBody EditEmployeeRequest editEmployeeRequest) {
        // TODO check id and user here
        return employeeService.editById(id, editEmployeeRequest);
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Integer id) {
        // TODO check id here
        return employeeService.removeById(id);
    }
}
