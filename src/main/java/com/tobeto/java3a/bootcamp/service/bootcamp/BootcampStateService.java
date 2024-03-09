package com.tobeto.java3a.bootcamp.service.bootcamp;

import com.tobeto.java3a.bootcamp.dto.bootcamp.state.request.CreateBootcampStateRequest;
import com.tobeto.java3a.bootcamp.dto.bootcamp.state.request.EditBootcampStateRequest;
import com.tobeto.java3a.bootcamp.model.bootcamp.BootcampState;
import com.tobeto.java3a.bootcamp.repository.bootcamp.BootcampStateRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BootcampStateService {

    private final BootcampStateRepository bootcampStateRepository;
    private final ModelMapper modelMapper;

    public List<BootcampState> get() {
        return bootcampStateRepository.findAll();
    }

    public BootcampState getById(Integer id) {
        // TODO add Optional.orElseThrow() here
        return bootcampStateRepository.findById(id).get();
    }

    public boolean create(CreateBootcampStateRequest createBootcampStateRequest) {
        BootcampState bootcampState = modelMapper.map(createBootcampStateRequest, BootcampState.class);
        return bootcampStateRepository.save(bootcampState) != null;
    }

    public boolean editById(Integer id, EditBootcampStateRequest editBootcampStateRequest) {
        BootcampState bootcampState = modelMapper.map(editBootcampStateRequest, BootcampState.class);
        bootcampState.setId(id);

        return bootcampStateRepository.save(bootcampState) != null;
    }

    public boolean removeById(Integer id) {
        bootcampStateRepository.deleteById(id);
        return true;
    }
}
