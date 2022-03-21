package com.example.spring_security_home_work.servise.serviceImpl;

import com.example.spring_security_home_work.entity.Test;
import com.example.spring_security_home_work.repasitory.TestRepository;
import com.example.spring_security_home_work.servise.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }

    @Override
    public Test save(Test test) {
        return testRepository.save(test);
    }

    @Override
    public Optional<Test> findById(Long id) {
        return testRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
     testRepository.deleteById(id);
    }
}
