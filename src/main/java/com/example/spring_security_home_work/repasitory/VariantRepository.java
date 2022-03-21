package com.example.spring_security_home_work.repasitory;

import com.example.spring_security_home_work.entity.Variant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VariantRepository extends JpaRepository<Variant,Long> {

    @Override
    List<Variant> findAll();

    @Override
    <S extends Variant> S save(S entity);

    @Override
    Optional<Variant> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
