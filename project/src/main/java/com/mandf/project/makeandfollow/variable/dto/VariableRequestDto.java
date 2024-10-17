package com.mandf.project.makeandfollow.variable.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Builder
public class VariableRequestDto {

    @NotBlank(message = "이름을 적어주세요.")
    private String variableName;

    @NotBlank(message = "소속회사 적어주세요.")
    private String usedCompany;

    @NotBlank(message = "해당 모듈을 적어주세요.")
    private String moduleName;

}
