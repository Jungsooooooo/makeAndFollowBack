package com.mandf.project.makeandfollow.common.dto;

import com.mandf.project.makeandfollow.common.enumtype.Errorcode;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.ResponseEntity;

@Getter
@Builder
public class ErrorResponseDto {
    private String status;
    private String code;
    private String message;

    public static ResponseEntity<ErrorResponseDto> toResponseEntity(Errorcode e){
        return ResponseEntity
                .status(e.getHttpStatus())
                .body(ErrorResponseDto.builder()
                        .code(e.getCode())
                        .message(e.getMessage())
                        .build());
    }
}
