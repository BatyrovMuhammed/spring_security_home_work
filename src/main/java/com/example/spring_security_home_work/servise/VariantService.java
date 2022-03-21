package com.example.spring_security_home_work.servise;

import com.example.spring_security_home_work.entity.Variant;

import java.util.List;
import java.util.Optional;

public interface VariantService {

    List<Variant> findAll();

    Variant save(Variant question);

    Optional<Variant> findById(Long id);

    void deleteById(Long id);
}
