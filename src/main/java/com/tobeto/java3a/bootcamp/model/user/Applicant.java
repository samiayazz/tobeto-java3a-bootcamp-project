package com.tobeto.java3a.bootcamp.model.user;

import com.tobeto.java3a.bootcamp.model.application.Application;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Applicant extends MyUser {
    
    private String about;

    @OneToMany(mappedBy = "applicant", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @Setter(AccessLevel.PRIVATE)
    private List<Application> applications;
}
