package com.mandf.project.makeandfollow.user.dto;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class UserJoinRequestDto {

    private String userId;
    private String password;
    private String status;
    private String type;
    private String userUid;
}
