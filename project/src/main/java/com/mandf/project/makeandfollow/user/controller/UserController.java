package com.mandf.project.makeandfollow.user.controller;

import com.mandf.project.makeandfollow.user.dto.UserJoinRequestDto;
import com.mandf.project.makeandfollow.user.dto.UserLoginRequestDto;
import com.mandf.project.makeandfollow.user.service.UserService;
import lombok.RequiredArgsConstructor;
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
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> userJoin(@RequestBody @Valid UserJoinRequestDto userJoinRequestDto) throws Exception {

        return new ResponseEntity<>(userService.insertUser(userJoinRequestDto), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody @Valid UserLoginRequestDto userLoginRequestDto) throws Exception {

        return new ResponseEntity<>(userService.userLogin(userLoginRequestDto), HttpStatus.OK);
    }

}
