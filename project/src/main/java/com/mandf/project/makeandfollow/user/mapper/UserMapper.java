package com.mandf.project.makeandfollow.user.mapper;

import com.mandf.project.makeandfollow.user.dto.UserJoinRequestDto;
import com.mandf.project.makeandfollow.user.dto.UserLoginRequestDto;
import com.mandf.project.makeandfollow.user.dto.UserLoginResponseDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(UserJoinRequestDto userJoinRequestDto);

    UserLoginResponseDto loginUser(UserLoginRequestDto userLoginRequestDto);
}
