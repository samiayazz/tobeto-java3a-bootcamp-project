package com.tobeto.java3a.bootcamp.model.user;

import com.tobeto.java3a.bootcamp.model.bootcamp.Bootcamp;
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
public class Instructor extends MyUser {

    private String companyName;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @Setter(AccessLevel.PRIVATE)
    private List<Bootcamp> bootcamps;
}
