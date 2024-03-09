package com.tobeto.java3a.bootcamp.repository.user;

import com.tobeto.java3a.bootcamp.model.user.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
}
