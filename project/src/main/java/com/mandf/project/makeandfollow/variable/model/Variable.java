package com.mandf.project.makeandfollow.variable.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Variable {

    private String variableName;
    private String usedCompany;
    private String moduleName;
}
