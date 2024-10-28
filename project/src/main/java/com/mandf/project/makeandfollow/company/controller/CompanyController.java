package com.mandf.project.makeandfollow.company.controller;

import com.mandf.project.makeandfollow.company.dto.CompanyFindByCodeRequestDto;
import com.mandf.project.makeandfollow.company.dto.CompanyFindByUUIDRequestDto;
import com.mandf.project.makeandfollow.company.dto.CompanyInsertRequestDto;
import com.mandf.project.makeandfollow.company.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping("/findbyid")
    public ResponseEntity<?> findCompanyByCode(@RequestBody CompanyFindByCodeRequestDto companyFindByCodeRequestDto){

        return new ResponseEntity<>(companyService.findCompanyByCode(companyFindByCodeRequestDto), HttpStatus.OK);
    }

    @PostMapping("/findbyuuid")
    public ResponseEntity<?> findCompanyByUUID(@RequestBody CompanyFindByUUIDRequestDto companyFindByUUIDRequestDto){

        return new ResponseEntity<>(companyService.findCompanyByUUID(companyFindByUUIDRequestDto), HttpStatus.OK);
    }



    @PostMapping("/insert")
    public ResponseEntity<?> insertCompany(@RequestBody CompanyInsertRequestDto companyInsertRequestDto) throws Exception {

        return new ResponseEntity<>(companyService.insertCompany(companyInsertRequestDto), HttpStatus.OK);
    }

}
