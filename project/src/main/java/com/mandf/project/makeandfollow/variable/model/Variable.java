package com.mandf.project.makeandfollow.variable.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Variable {

    private String variableName;
    private String used_company;
    private String makerUid;
    private String moduleName;

}
