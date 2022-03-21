package com.example.spring_security_home_work;

import com.example.spring_security_home_work.entity.Role;
import com.example.spring_security_home_work.entity.User;
import com.example.spring_security_home_work.repasitory.UserRepository;
import com.example.spring_security_home_work.servise.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.common.util.impl.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityHomeWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityHomeWorkApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return  args -> {
            userService.saveRole(new Role("ROLE_ADMIN"));
            userService.saveRole(new Role("ROLE_USER"));

            userService.save(new UserDto("Muhammed","muhammed@gmail.com","1234"));
           // userService.save(new UserDto("Rahim","rahim@gmail.com","1234"));
//          userService.save(new User("Nurullo","nurullo@gmail.com","1234",new ArrayList<>()));
//          userService.save(new User("Zynatullo","zyinatullo@gmail.com","1234",new ArrayList<>()));

            userService.addRoleToUser("Muhammed","ROLE_ADMIN");
            //userService.addRoleToUser("Rahim","ROLE_USER");

//          userService.addRoleToUser("Rahim","ROLE_MANAGER");
//          userService.addRoleToUser("Nurullo","ROLE_ADMIN");
//          userService.addRoleToUser("Zynatullo","ROLE_SUPER_ADMIN");
//          userService.addRoleToUser("Zynatullo","ROLE_ADMIN");
//          userService.addRoleToUser("Zynatullo","ROLE_USER");
        };

    }

   private UserRepository userRepository ;
   private UserService userService;

    @PostConstruct
    public void init(){
//      userService.addRoleToUser("Muhammed","ROLE_ADMIN");
//      userService.addRoleToUser("Rahim","ROLE_USER");
      // userRepository.save(new User("Muhammed","muhammed@gmail.com","1234",userService.addRoleToUser("Muhammed","ROLE_ADMIN")));
    }
}
