package com.mandf.project.makeandfollow.company.service;

import com.mandf.project.makeandfollow.company.dto.*;
import com.mandf.project.makeandfollow.company.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyMapper companyMapper;

    public CompanyFindResponeDto findCompanyByCode(CompanyFindByCodeRequestDto companyFindByCodeRequestDto){

        return companyMapper.findCompanyByCode(companyFindByCodeRequestDto);
    }

    public CompanyFindResponeDto findCompanyByUUID(CompanyFindByUUIDRequestDto companyFindByUUIDRequestDto){

        return companyMapper.findCompanyByUUID(companyFindByUUIDRequestDto);
    }

    public int insertCompany(CompanyInsertRequestDto companyInsertRequestDto) throws Exception {
        int result = 0;

        result =companyMapper.insertCompany(companyInsertRequestDto);

        return result;
    }

    public CompanyUpdateResponseDto updateCompany(CompanyUpdateRequestDto companyUpdateRequestDto){

        return companyMapper.updateCompany(companyUpdateRequestDto);
    }
}
