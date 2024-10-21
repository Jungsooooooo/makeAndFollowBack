package com.mandf.project.makeandfollow.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserLoginResponseDto {

    private String userId;
    private String password;
}
