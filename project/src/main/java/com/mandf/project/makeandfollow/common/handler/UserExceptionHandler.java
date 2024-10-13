package com.mandf.project.makeandfollow.common.handler;

import com.mandf.project.makeandfollow.common.dto.ErrorResponseDto;
import com.mandf.project.makeandfollow.common.exception.UserException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler(UserException.class)
    protected ResponseEntity<ErrorResponseDto> handleCustomException(UserException e){
        return ErrorResponseDto.toResponseEntity(e.getErrorCode());
    }
}
