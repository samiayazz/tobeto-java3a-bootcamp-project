package com.tobeto.java3a.bootcamp.repository.user;

import com.tobeto.java3a.bootcamp.model.user.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
