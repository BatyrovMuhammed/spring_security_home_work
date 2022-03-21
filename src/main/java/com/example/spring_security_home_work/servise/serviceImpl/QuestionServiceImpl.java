package com.example.spring_security_home_work.servise.serviceImpl;

import com.example.spring_security_home_work.entity.Question;
import com.example.spring_security_home_work.repasitory.QuestionRepository;
import com.example.spring_security_home_work.servise.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

  private final   QuestionRepository questionRepository;

  @Override
  public List<Question> findAll() {
    return questionRepository.findAll();
  }

  @Override
  public Question save(Question question) {
    return questionRepository.save(question);
  }

  @Override
  public Optional<Question> findById(Long id) {
    return questionRepository.findById(id);
  }

  @Override
  public void deleteById(Long id) {
  questionRepository.deleteById(id);
  }
}
