package com.mandf.project.makeandfollow.company.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
@ToString
public class CompanyFindByUUIDRequestDto {
    @NotBlank(message = "UUID 값을 입력해주세요")
    private String uuid;
}
