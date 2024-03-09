package com.tobeto.java3a.bootcamp.service.user;

import com.tobeto.java3a.bootcamp.dto.user.common.request.LoginUserRequest;
import com.tobeto.java3a.bootcamp.dto.user.instructor.request.CreateInstructorRequest;
import com.tobeto.java3a.bootcamp.dto.user.instructor.request.EditInstructorRequest;
import com.tobeto.java3a.bootcamp.model.user.Instructor;
import com.tobeto.java3a.bootcamp.repository.user.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorService {

    private final InstructorRepository instructorRepository;
    private final ModelMapper modelMapper;

    public List<Instructor> get() {
        return instructorRepository.findAll();
    }

    public Instructor getById(Integer id) {
        return instructorRepository.findById(id).get();
    }

    public boolean login(LoginUserRequest loginUserRequest) {
        // TODO check credential and password here
        return instructorRepository.findByEmailOrUserNameAndPassword(
                loginUserRequest.getCredential(),
                loginUserRequest.getPassword()
        ).isPresent();
    }

    public boolean create(CreateInstructorRequest createInstructorRequest) {
        Instructor instructor = modelMapper.map(createInstructorRequest, Instructor.class);
        return instructorRepository.save(instructor) != null;
    }

    public boolean editById(Integer id, EditInstructorRequest editInstructorRequest) {
        Instructor instructor = modelMapper.map(editInstructorRequest, Instructor.class);
        instructor.setId(id);
        return instructorRepository.save(instructor) != null;
    }

    public boolean removeById(Integer id) {
        instructorRepository.deleteById(id);
        return true;
    }
}
