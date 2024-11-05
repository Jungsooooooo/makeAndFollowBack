package com.mandf.project.makeandfollow.variable.controller;

import com.mandf.project.makeandfollow.variable.dto.VariableRequestDto;
import com.mandf.project.makeandfollow.variable.dto.VariableWithCompanyUserUidRequestDto;
import com.mandf.project.makeandfollow.variable.service.VariableService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
@Slf4j
public class VariableController {

    private final VariableService variableService;

    @PostMapping("/findAll")
    public ResponseEntity<?> findVariableAll() {
        log.info("FindCompanyByCode ::");
        return new ResponseEntity<>(variableService.getAllVariables(), HttpStatus.OK);
    }

    @PostMapping("/insert-variable")
    public ResponseEntity<?> insertVariable(@RequestBody VariableRequestDto variableRequestDto) throws Exception {
        log.info("insertVariable :: RequestBody[{}]", variableRequestDto);
        return new ResponseEntity<>(variableService.insertVariable(variableRequestDto), HttpStatus.OK);
    }

    @PostMapping("/insert-with-variable-company-user-uid")
    public ResponseEntity<?> insertVariableWithCompanyUserUid(@RequestBody VariableWithCompanyUserUidRequestDto variableWithCompanyUserUidRequestDto) throws Exception {
        log.info("InsertVariableWithCompanyUserUid :: RequestBody[{}]", variableWithCompanyUserUidRequestDto);
        return new ResponseEntity<>(variableService.insertVariableWithCompanyUserUid(variableWithCompanyUserUidRequestDto), HttpStatus.OK);
    }
}
