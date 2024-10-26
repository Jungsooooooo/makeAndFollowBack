package com.mandf.project.makeandfollow.company.mapper;


import com.mandf.project.makeandfollow.company.dto.CompanyInsertRequestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {

    int insertCompany(CompanyInsertRequestDto companyInsertRequestDto);
}
