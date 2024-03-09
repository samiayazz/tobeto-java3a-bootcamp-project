package com.tobeto.java3a.bootcamp.controller.bootcamp;

import com.tobeto.java3a.bootcamp.dto.bootcamp.state.request.CreateBootcampStateRequest;
import com.tobeto.java3a.bootcamp.dto.bootcamp.state.request.EditBootcampStateRequest;
import com.tobeto.java3a.bootcamp.model.bootcamp.BootcampState;
import com.tobeto.java3a.bootcamp.service.bootcamp.BootcampStateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bootcamp/state")
@RequiredArgsConstructor
public class BootcampStateController {

    private final BootcampStateService bootcampStateService;

    @GetMapping
    public List<BootcampState> get() {
        return bootcampStateService.get();
    }

    @GetMapping("/{id}")
    public BootcampState getById(@PathVariable Integer id) {
        // TODO check id here
        return bootcampStateService.getById(id);
    }

    @PostMapping("/create")
    public boolean create(@RequestBody CreateBootcampStateRequest createBootcampStateRequest) {
        // TODO check createBootcampStateRequest here
        return bootcampStateService.create(createBootcampStateRequest);
    }

    @PutMapping("/edit/{id}")
    public boolean editById(@PathVariable Integer id, @RequestBody EditBootcampStateRequest editBootcampStateRequest) {
        // TODO check editBootcampStateRequest here
        return bootcampStateService.editById(id, editBootcampStateRequest);
    }

    @DeleteMapping("/remove/{id}")
    public boolean removeById(@PathVariable Integer id) {
        // TODO check id here
        return bootcampStateService.removeById(id);
    }
}
