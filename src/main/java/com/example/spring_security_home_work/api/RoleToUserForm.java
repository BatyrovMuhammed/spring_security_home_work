package com.example.spring_security_home_work.api;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;

@Data
class RoleToUserForm {

    private String username;
    private String roleName;

}
