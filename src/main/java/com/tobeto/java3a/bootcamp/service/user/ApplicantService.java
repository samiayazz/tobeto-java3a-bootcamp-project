package com.tobeto.java3a.bootcamp.service.user;

import com.tobeto.java3a.bootcamp.dto.user.applicant.request.CreateApplicantRequest;
import com.tobeto.java3a.bootcamp.dto.user.applicant.request.EditApplicantRequest;
import com.tobeto.java3a.bootcamp.dto.user.applicant.request.LoginApplicantRequest;
import com.tobeto.java3a.bootcamp.model.user.Applicant;
import com.tobeto.java3a.bootcamp.repository.user.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicantService {

    private final ApplicantRepository applicantRepository;
    private final ModelMapper modelMapper;

    public List<Applicant> get() {
        return applicantRepository.findAll();
    }

    public Applicant getById(Integer id) {
        return applicantRepository.findById(id).get();
    }

    public boolean login(LoginApplicantRequest loginApplicantRequest) {
        // TODO check credential and password here
        return applicantRepository.findByEmailOrUserNameAndPassword(
                loginApplicantRequest.getCredential(),
                loginApplicantRequest.getPassword()
        ).isPresent();
    }

    public boolean create(CreateApplicantRequest createApplicantRequest) {
        Applicant applicant = modelMapper.map(createApplicantRequest, Applicant.class);
        return applicantRepository.save(applicant) != null;
    }

    public boolean editById(Integer id, EditApplicantRequest editApplicantRequest) {
        Applicant applicant = modelMapper.map(editApplicantRequest, Applicant.class);
        applicant.setId(id);
        return applicantRepository.save(applicant) != null;
    }

    public boolean removeById(Integer id) {
        applicantRepository.deleteById(id);
        return true;
    }
}
