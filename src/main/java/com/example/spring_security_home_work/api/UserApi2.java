package com.example.spring_security_home_work.api;

import com.example.spring_security_home_work.UserDto;
import com.example.spring_security_home_work.entity.User;
import com.example.spring_security_home_work.servise.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
@RequiredArgsConstructor
public class UserApi2 {

    private final UserService userService;

    @PostMapping("/user2/save")
    public UserDto saveUser2(@RequestBody UserDto user){
        System.out.println("there works 1");
        return userService.save(user);
    }
}
