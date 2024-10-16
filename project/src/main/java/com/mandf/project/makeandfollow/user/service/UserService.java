package com.mandf.project.makeandfollow.user.service;

import com.mandf.project.makeandfollow.common.enumtype.Errorcode;
import com.mandf.project.makeandfollow.common.exception.UserException;
import com.mandf.project.makeandfollow.user.dto.UserJoinRequestDto;
import com.mandf.project.makeandfollow.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponseException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public int insertUser(UserJoinRequestDto userJoinRequestDto) throws Exception{
        int result =0;

        try {
            result = userMapper.insertUser(userJoinRequestDto);
        } catch (Exception e){
            throw new UserException(Errorcode.INVALID_USER);
        }
        return result;
    }
}
