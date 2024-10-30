package com.mandf.project.makeandfollow.company.mapper;


import com.mandf.project.makeandfollow.company.dto.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {

    CompanyFindResponeDto findCompanyByCode(CompanyFindByCodeRequestDto companyFindByCodeRequestDto);
    CompanyFindResponeDto findCompanyByUUID(CompanyFindByUUIDRequestDto companyFindByUUIDRequestDto);

    CompanyUpdateResponseDto updateCompany(CompanyUpdateRequestDto companyUpdateRequestDto);

    int insertCompany(CompanyInsertRequestDto companyInsertRequestDto);
}
