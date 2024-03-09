package com.tobeto.java3a.bootcamp.controller.user;

import com.tobeto.java3a.bootcamp.dto.user.applicant.request.CreateApplicantRequest;
import com.tobeto.java3a.bootcamp.dto.user.applicant.request.EditApplicantRequest;
import com.tobeto.java3a.bootcamp.model.user.Applicant;
import com.tobeto.java3a.bootcamp.service.user.ApplicantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicant")
@RequiredArgsConstructor
public class ApplicantController {

    private final ApplicantService applicantService;

    @GetMapping
    public List<Applicant> get() {
        return applicantService.get();
    }

    @GetMapping("/{id}")
    public Applicant getById(Integer id) {
        return applicantService.getById(id);
    }

    @PostMapping("/create")
    public boolean create(@RequestBody CreateApplicantRequest createApplicantRequest) {
        // TODO check user here
        return applicantService.create(createApplicantRequest);
    }

    @PutMapping("/edit/{id}")
    public boolean editById(@PathVariable Integer id, @RequestBody EditApplicantRequest editApplicantRequest) {
        // TODO check id and user here
        return applicantService.editById(id, editApplicantRequest);
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Integer id) {
        // TODO check id here
        return applicantService.removeById(id);
    }
}
