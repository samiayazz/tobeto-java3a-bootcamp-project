package com.tobeto.java3a.bootcamp.model.bootcamp;

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
public class BootcampState extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "bootcampState", fetch = FetchType.LAZY)
    @Setter(AccessLevel.PRIVATE)
    private List<Bootcamp> bootcamps;
}
