package com.mandf.project.makeandfollow.variable.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class VariableResponseDto {

    private String variableName;
    private String moduleName;
}
