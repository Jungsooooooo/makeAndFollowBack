package com.mandf.project.makeandfollow.user.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class UserLoginRequestDto {
    
    @NotBlank(message = "아이디를 입력해주세요")
    private String userId;

    @NotBlank(message = "비밀번호를 입력해주세요")
    private String password;
}