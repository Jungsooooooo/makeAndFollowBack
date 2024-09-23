package com.mandf.project.makeandfollow.variable.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class VariableController {

    @GetMapping("/success")
    public String testAPi(){
        return "success";
    }
}
