package com.tobeto.java3a.bootcamp.repository.user;

import com.tobeto.java3a.bootcamp.model.user.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

    @Query("select i from Instructor i where (i.email = ?1 or i.userName = ?1) and i.password = ?2")
    Optional<Instructor> findByEmailOrUserNameAndPassword(String credential, String password);
}
