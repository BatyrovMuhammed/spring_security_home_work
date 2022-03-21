package com.example.spring_security_home_work.servise;

import com.example.spring_security_home_work.entity.Question;
import com.example.spring_security_home_work.entity.Test;

import java.util.List;
import java.util.Optional;

public interface TestService {

    List<Test> findAll();

    Test save(Test test);

    Optional<Test> findById(Long id);

    void deleteById(Long id);
}
