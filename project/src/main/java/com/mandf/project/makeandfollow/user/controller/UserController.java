package com.mandf.project.makeandfollow.user.controller;

import com.mandf.project.makeandfollow.user.dto.UserJoinRequestDto;
import com.mandf.project.makeandfollow.user.dto.UserLoginRequestDto;
import com.mandf.project.makeandfollow.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> insertUser(@RequestBody @Valid UserJoinRequestDto userJoinRequestDto) throws Exception {
        log.info("InsertUser :: RequestBody[{}]", userJoinRequestDto);
        return new ResponseEntity<>(userService.insertUser(userJoinRequestDto), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody @Valid UserLoginRequestDto userLoginRequestDto) throws Exception {
        log.info("LoginUser :: RequestBody[{}]", userLoginRequestDto);
        return new ResponseEntity<>(userService.userLogin(userLoginRequestDto), HttpStatus.OK);
    }

}
