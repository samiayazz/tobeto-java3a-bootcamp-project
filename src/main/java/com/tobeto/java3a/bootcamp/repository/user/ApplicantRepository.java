package com.tobeto.java3a.bootcamp.repository.user;

import com.tobeto.java3a.bootcamp.model.user.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
}
