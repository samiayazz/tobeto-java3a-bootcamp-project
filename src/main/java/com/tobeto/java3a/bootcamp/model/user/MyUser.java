package com.tobeto.java3a.bootcamp.model.user;

import com.tobeto.java3a.bootcamp.model.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class MyUser extends BaseEntity {

    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String nationalId;

    private String userName;
    private String email;
    private String password;
}
