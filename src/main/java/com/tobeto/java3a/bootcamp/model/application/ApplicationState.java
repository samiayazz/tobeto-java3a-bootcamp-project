package com.tobeto.java3a.bootcamp.model.application;

import com.tobeto.java3a.bootcamp.model.common.BaseEntity;
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
public class ApplicationState extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "applicationState", fetch = FetchType.LAZY)
    @Setter(AccessLevel.PRIVATE)
    private List<Application> applications;
}
