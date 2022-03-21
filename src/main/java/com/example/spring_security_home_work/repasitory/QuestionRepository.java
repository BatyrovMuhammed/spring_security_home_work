package com.example.spring_security_home_work.repasitory;

import com.example.spring_security_home_work.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {

    @Override
    List<Question> findAll();

    @Override
    <S extends Question> S save(S entity);

    @Override
    Optional<Question> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
