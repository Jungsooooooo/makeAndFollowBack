package com.mandf.project.makeandfollow.variable.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class VariableRequestDto {

    @NotBlank(message = "이름을 입력해주세요.")
    private String variableName;

    @NotBlank(message = "소속회사를 입력해주세요.")
    private String usedCompany;

    @NotBlank(message = "해당 모듈을 입력해주세요.")
    private String moduleName;
}
