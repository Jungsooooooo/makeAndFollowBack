package com.mandf.project.makeandfollow.company.controller;

import com.mandf.project.makeandfollow.company.dto.CompanyFindByCodeRequestDto;
import com.mandf.project.makeandfollow.company.dto.CompanyFindByUUIDRequestDto;
import com.mandf.project.makeandfollow.company.dto.CompanyInsertRequestDto;
import com.mandf.project.makeandfollow.company.dto.CompanyUpdateRequestDto;
import com.mandf.project.makeandfollow.company.service.CompanyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
@Slf4j
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping("/findbyid")
    public ResponseEntity<?> findCompanyByCode(@RequestBody CompanyFindByCodeRequestDto companyFindByCodeRequestDto){
        log.info("FindCompanyByCode :: RequestBody[{}]", companyFindByCodeRequestDto);
        return new ResponseEntity<>(companyService.findCompanyByCode(companyFindByCodeRequestDto), HttpStatus.OK);
    }

    @PostMapping("/findbyuuid")
    public ResponseEntity<?> findCompanyByUUID(@RequestBody CompanyFindByUUIDRequestDto companyFindByUUIDRequestDto){
        log.info("FindCompanyByUUID :: RequestBody[{}]", companyFindByUUIDRequestDto);
        return new ResponseEntity<>(companyService.findCompanyByUUID(companyFindByUUIDRequestDto), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<?> insertCompany(@RequestBody CompanyInsertRequestDto companyInsertRequestDto) throws Exception {
        log.info("InsertCompany :: RequestBody[{}]", companyInsertRequestDto);
        return new ResponseEntity<>(companyService.insertCompany(companyInsertRequestDto), HttpStatus.OK);
    }

    @PostMapping("/delete")
    public ResponseEntity<?> updateCompanyStatus(@RequestBody CompanyUpdateRequestDto companyUpdateRequestDto) throws Exception {
        log.info("UpdateCompanyStatus :: RequestBody[{}]", companyUpdateRequestDto);
        return new ResponseEntity<>(companyService.updateCompany(companyUpdateRequestDto),HttpStatus.OK);
    }



}
