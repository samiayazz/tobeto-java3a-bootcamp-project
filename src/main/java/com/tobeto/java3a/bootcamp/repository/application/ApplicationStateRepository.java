package com.tobeto.java3a.bootcamp.repository.application;

import com.tobeto.java3a.bootcamp.model.application.ApplicationState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationStateRepository extends JpaRepository<ApplicationState, Integer> {
}
