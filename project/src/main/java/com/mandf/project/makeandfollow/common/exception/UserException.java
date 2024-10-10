package com.mandf.project.makeandfollow.common.exception;

import lombok.Getter;

@Getter
public enum UserException {

    INVALID_USER("401", "사용 불가한 사람입니다");

    private String errCode;
    private String message;

    UserException(String errCode, String message){
        this.errCode = errCode;
        this.message = message;
    }
}
