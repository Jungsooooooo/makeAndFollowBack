package com.mandf.project.makeandfollow.variable.controller;

import com.mandf.project.makeandfollow.variable.dto.VariableRequestDto;
import com.mandf.project.makeandfollow.variable.dto.VariableWithCompanyUserUidRequestDto;
import com.mandf.project.makeandfollow.variable.service.VariableService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class VariableController {

    private final VariableService variableService;

    @PostMapping("/success")
    public String testAPi() {
        return "success";
    }

    @PostMapping("/findAll")
    public ResponseEntity<?> findVariableAll() {
        return new ResponseEntity<>(variableService.getAllVariables(), HttpStatus.OK);
    }

    @PostMapping("/insert-variable")
    public ResponseEntity<?> insertVariable(@RequestBody VariableRequestDto variableRequestDto) throws Exception {

        return new ResponseEntity<>(variableService.insertVariable(variableRequestDto), HttpStatus.OK);
    }

    @PostMapping("/insert-with-variable-company-user-uid")
    public ResponseEntity<?> insertVariableWithCompanyUserUid(@RequestBody VariableWithCompanyUserUidRequestDto variableWithCompanyUserUidRequestDto) throws Exception {

        return new ResponseEntity<>(variableService.insertVariableWithCompanyUserUid(variableWithCompanyUserUidRequestDto), HttpStatus.OK);
    }
}
