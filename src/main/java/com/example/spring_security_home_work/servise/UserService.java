package com.example.spring_security_home_work.servise;

import com.example.spring_security_home_work.UserDto;
import com.example.spring_security_home_work.entity.Role;
import com.example.spring_security_home_work.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Role saveRole(Role role);

    void addRoleToUser(String username,String roleName);

    User getUser(String username);

    UserDto save(UserDto user);

    Optional<User> findById(Long id);

    void deleteById(Long id);
}
