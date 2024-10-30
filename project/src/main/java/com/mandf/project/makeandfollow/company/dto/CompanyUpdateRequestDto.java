package com.mandf.project.makeandfollow.company.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CompanyUpdateRequestDto {

    private String status;
    private String companyUid;
}
