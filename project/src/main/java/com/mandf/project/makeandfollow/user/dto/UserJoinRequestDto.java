package com.mandf.project.makeandfollow.user.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import javax.validation.constraints.NotNull;


@Getter
@Builder
public class UserJoinRequestDto {

    @NotNull(message = "아이디를 입력해주세요")
    private String userId;

    @NotNull(message = "비밀번호를 입력해주세요")
    private String password;
    private String status;
    private String type;
    private String userUid;
}
