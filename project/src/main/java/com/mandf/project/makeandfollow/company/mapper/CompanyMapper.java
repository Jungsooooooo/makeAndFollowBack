package com.mandf.project.makeandfollow.company.mapper;


import com.mandf.project.makeandfollow.company.dto.CompanyFindByCodeRequestDto;
import com.mandf.project.makeandfollow.company.dto.CompanyFindByUUIDRequestDto;
import com.mandf.project.makeandfollow.company.dto.CompanyFindResponeDto;
import com.mandf.project.makeandfollow.company.dto.CompanyInsertRequestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {

    CompanyFindResponeDto findCompanyByCode(CompanyFindByCodeRequestDto companyFindByCodeRequestDto);
    CompanyFindResponeDto findCompanyByUUID(CompanyFindByUUIDRequestDto companyFindByUUIDRequestDto);

    int insertCompany(CompanyInsertRequestDto companyInsertRequestDto);
}
