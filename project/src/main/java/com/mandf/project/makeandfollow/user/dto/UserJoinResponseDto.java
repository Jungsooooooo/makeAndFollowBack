package com.mandf.project.makeandfollow.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserJoinResponseDto {

    private String id;
    private String password;
}
