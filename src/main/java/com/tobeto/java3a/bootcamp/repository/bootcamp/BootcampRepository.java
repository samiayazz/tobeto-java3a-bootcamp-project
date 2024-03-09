package com.tobeto.java3a.bootcamp.repository.bootcamp;

import com.tobeto.java3a.bootcamp.model.bootcamp.BootcampState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<BootcampState, Integer> {
}
