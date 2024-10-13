package com.mandf.project.makeandfollow.common.exception;

import com.mandf.project.makeandfollow.common.enumtype.Errorcode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserException extends RuntimeException {

    Errorcode errorCode;
}
