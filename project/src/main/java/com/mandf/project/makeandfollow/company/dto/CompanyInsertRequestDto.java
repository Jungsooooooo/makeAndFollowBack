package com.mandf.project.makeandfollow.company.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CompanyInsertRequestDto {

    private String companyName;
    private String companyCode;
}
