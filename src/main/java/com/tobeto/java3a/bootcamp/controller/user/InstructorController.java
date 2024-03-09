package com.tobeto.java3a.bootcamp.controller.user;

import com.tobeto.java3a.bootcamp.dto.user.common.request.LoginUserRequest;
import com.tobeto.java3a.bootcamp.dto.user.instructor.request.CreateInstructorRequest;
import com.tobeto.java3a.bootcamp.dto.user.instructor.request.EditInstructorRequest;
import com.tobeto.java3a.bootcamp.model.user.Instructor;
import com.tobeto.java3a.bootcamp.service.user.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @GetMapping
    public List<Instructor> get() {
        return instructorService.get();
    }

    @GetMapping("/{id}")
    public Instructor getById(Integer id) {
        // TODO check id here
        return instructorService.getById(id);
    }

    @PostMapping("/login")
    public boolean login(@RequestBody LoginUserRequest loginUserRequest) {
        // TODO check credential and password here
        return instructorService.login(loginUserRequest);
    }

    @PostMapping("/create")
    public boolean create(@RequestBody CreateInstructorRequest createInstructorRequest) {
        // TODO check user here
        return instructorService.create(createInstructorRequest);
    }

    @PutMapping("/edit/{id}")
    public boolean editById(@PathVariable Integer id, @RequestBody EditInstructorRequest editInstructorRequest) {
        // TODO check id and user here
        return instructorService.editById(id, editInstructorRequest);
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Integer id) {
        // TODO check id here
        return instructorService.removeById(id);
    }
}
