package com.example.spring_security_home_work.api;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class TokenTest {

    @PostMapping("/test")
    public String testToken(Authentication authentication) {
        return authentication.getName();
    }
}
