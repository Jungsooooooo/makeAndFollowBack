package com.mandf.project.makeandfollow.user.mapper;

import com.mandf.project.makeandfollow.user.dto.UserJoinRequestDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insertUser(UserJoinRequestDto userJoinRequestDto);
}
