package com.mandf.project.makeandfollow.variable.controller;

import com.mandf.project.makeandfollow.variable.service.VariableService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class VariableController {

    private final VariableService variableService;

    @PostMapping("/success")
    public String testAPi(){
        return "success";
    }

    @PostMapping("/findAll")
    public ResponseEntity<?> findVariableAll(){
        return new ResponseEntity<>(variableService.getAllVariables(),HttpStatus.OK);
    }
}
