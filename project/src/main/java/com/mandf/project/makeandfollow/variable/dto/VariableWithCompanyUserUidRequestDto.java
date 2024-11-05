package com.mandf.project.makeandfollow.variable.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@ToString
public class VariableWithCompanyUserUidRequestDto {

    @NotBlank(message = "이름을 입력해주세요.")
    private String variableName;

    @NotBlank(message = "소속회사를 입력해주세요.")
    private String usedCompany;

    @NotBlank(message = "해당 모듈을 입력해주세요.")
    private String moduleName;

    @NotBlank(message = "유저 정보를 입력해주세요")
    private String userUid;

    @NotBlank(message = "회사명을 입력해주세요.")
    private String companyUid;
}
