package com.example.spring_security_home_work.repasitory;

import com.example.spring_security_home_work.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    User findByName(String name);

    @Override
    List<User> findAll();

    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
