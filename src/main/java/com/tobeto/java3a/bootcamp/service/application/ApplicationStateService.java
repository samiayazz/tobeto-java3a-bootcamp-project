package com.tobeto.java3a.bootcamp.service.application;

import com.tobeto.java3a.bootcamp.dto.application.state.request.CreateApplicationStateRequest;
import com.tobeto.java3a.bootcamp.dto.application.state.request.EditApplicationStateRequest;
import com.tobeto.java3a.bootcamp.model.application.ApplicationState;
import com.tobeto.java3a.bootcamp.repository.application.ApplicationStateRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationStateService {

    private final ApplicationStateRepository applicationStateRepository;
    private final ModelMapper modelMapper;

    public List<ApplicationState> get() {
        return applicationStateRepository.findAll();
    }

    public ApplicationState getById(Integer id) {
        // TODO add Optional.orElseThrow() here
        return applicationStateRepository.findById(id).get();
    }

    public boolean create(CreateApplicationStateRequest createApplicationStateRequest) {
        ApplicationState applicationState = modelMapper.map(createApplicationStateRequest, ApplicationState.class);
        return applicationStateRepository.save(applicationState) != null;
    }

    public boolean editById(Integer id, EditApplicationStateRequest editApplicationStateRequest) {
        ApplicationState applicationState = modelMapper.map(editApplicationStateRequest, ApplicationState.class);
        applicationState.setId(id);

        return applicationStateRepository.save(applicationState) != null;
    }

    public boolean removeById(Integer id) {
        applicationStateRepository.deleteById(id);
        return true;
    }
}
