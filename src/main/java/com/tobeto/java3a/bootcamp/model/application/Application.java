package com.tobeto.java3a.bootcamp.model.application;

import com.tobeto.java3a.bootcamp.model.bootcamp.Bootcamp;
import com.tobeto.java3a.bootcamp.model.common.BaseEntity;
import com.tobeto.java3a.bootcamp.model.user.Applicant;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Application extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    private Applicant applicant;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    private Bootcamp bootcamp;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE, optional = false)
    private ApplicationState applicationState;
}
