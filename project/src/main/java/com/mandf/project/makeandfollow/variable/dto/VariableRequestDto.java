package com.mandf.project.makeandfollow.variable.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class VariableRequestDto {

    private String variableName;
    private String usedCompany;
    private String userUid;
    private String moduleName;

}
