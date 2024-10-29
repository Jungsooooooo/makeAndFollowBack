package com.mandf.project.makeandfollow.variable.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Variable {

    private String variableName;
    private String usedCompany;
    private String moduleName;
    private String userUid;
    private String companyUid;
}
