package com.mandf.project.makeandfollow.company.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@ToString
public class CompanyUpdateRequestDto {

    @NotBlank(message = "상태 값을 입력해주세요")
    private String status;

    @NotBlank(message = "회사Uid를 입력해주세요")
    private String companyUid;
}
