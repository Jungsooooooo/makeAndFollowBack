package com.mandf.project.makeandfollow.company.service;

import com.mandf.project.makeandfollow.company.dto.CompanyInsertRequestDto;
import com.mandf.project.makeandfollow.company.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyMapper companyMapper;

    public int insertCompany(CompanyInsertRequestDto companyInsertRequestDto) throws Exception {
        int result = 0;

        result =companyMapper.insertCompany(companyInsertRequestDto);

        return result;

    }
}
