package com.tobeto.java3a.bootcamp.repository.user;

import com.tobeto.java3a.bootcamp.model.user.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select e from Employee e where (e.email = ?1 or e.userName = ?1) and e.password = ?2")
    Optional<Employee> findByEmailOrUserNameAndPassword(String credential, String password);
}
