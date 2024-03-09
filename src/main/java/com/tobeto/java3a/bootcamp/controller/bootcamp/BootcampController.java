package com.tobeto.java3a.bootcamp.controller.bootcamp;

import com.tobeto.java3a.bootcamp.service.bootcamp.BootcampService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bootcamp")
@RequiredArgsConstructor
public class BootcampController {

    private final BootcampService bootcampService;
}
