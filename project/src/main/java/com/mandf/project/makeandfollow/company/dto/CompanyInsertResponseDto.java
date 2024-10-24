package com.mandf.project.makeandfollow.company.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CompanyInsertResponseDto {

    private String companyName;
    private String companyUid;
    private String companyCode;
}
