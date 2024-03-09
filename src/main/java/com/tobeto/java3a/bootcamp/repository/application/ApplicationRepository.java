package com.tobeto.java3a.bootcamp.repository.application;

import com.tobeto.java3a.bootcamp.model.application.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
