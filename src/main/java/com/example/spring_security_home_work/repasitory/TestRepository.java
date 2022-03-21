package com.example.spring_security_home_work.repasitory;

import com.example.spring_security_home_work.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {

    @Override
    List<Test> findAll();

    @Override
    <S extends Test> S save(S entity);

    @Override
    Optional<Test> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
