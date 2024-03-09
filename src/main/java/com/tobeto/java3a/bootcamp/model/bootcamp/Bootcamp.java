package com.tobeto.java3a.bootcamp.model.bootcamp;

import com.tobeto.java3a.bootcamp.model.application.Application;
import com.tobeto.java3a.bootcamp.model.common.BaseEntity;
import com.tobeto.java3a.bootcamp.model.user.Instructor;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Bootcamp extends BaseEntity {

    private String name;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.MERGE)
    private Instructor instructor;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.MERGE)
    private BootcampState bootcampState;

    @OneToMany(mappedBy = "bootcamp", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @Setter(AccessLevel.PRIVATE)
    private List<Application> applications;
}
