package com.muru.buildpacks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public String hello() {
        return "Welcome to the Spring boot Buildpacks!!. Get rid of Dockerfile hassels.";
    }

}
