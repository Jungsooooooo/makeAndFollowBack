package com.mandf.project.makeandfollow.company.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@ToString
public class CompanyInsertRequestDto {

    @NotBlank(message = "회사명을 입력해주세요")
    private String companyName;
    @NotBlank(message = "코드 값을 입력해주세요")
    private String companyCode;

}
