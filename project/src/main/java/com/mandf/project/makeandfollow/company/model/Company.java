package com.mandf.project.makeandfollow.company.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Company {

    private String companyName;
    private String companyUid;
    private String companyCode;
    private String status;
}
