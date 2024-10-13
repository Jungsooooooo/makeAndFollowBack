package com.mandf.project.makeandfollow.common.enumtype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum Errorcode {

    INVALID_USER(HttpStatus.BAD_REQUEST,"400", "사용 불가한 사람입니다");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

}
