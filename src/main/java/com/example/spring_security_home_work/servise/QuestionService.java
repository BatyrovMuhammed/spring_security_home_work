package com.example.spring_security_home_work.servise;

import com.example.spring_security_home_work.entity.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {

    List<Question> findAll();

    Question save(Question question);

    Optional<Question> findById(Long id);

    void deleteById(Long id);
}
