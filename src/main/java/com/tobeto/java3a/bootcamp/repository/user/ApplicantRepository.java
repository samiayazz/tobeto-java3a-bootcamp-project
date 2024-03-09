package com.tobeto.java3a.bootcamp.repository.user;

import com.tobeto.java3a.bootcamp.model.user.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {

    @Query("select a from Applicant a where (a.email = ?1 or a.userName = ?1) and a.password = ?2")
    Optional<Applicant> findByEmailOrUserNameAndPassword(String credential, String password);
}
