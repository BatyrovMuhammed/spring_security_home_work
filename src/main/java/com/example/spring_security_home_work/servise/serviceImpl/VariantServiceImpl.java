package com.example.spring_security_home_work.servise.serviceImpl;

import com.example.spring_security_home_work.entity.Variant;
import com.example.spring_security_home_work.repasitory.VariantRepository;
import com.example.spring_security_home_work.servise.VariantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class VariantServiceImpl implements VariantService {

    private final VariantRepository variantRepository;

    @Override
    public List<Variant> findAll() {
        return variantRepository.findAll();
    }

    @Override
    public Variant save(Variant question) {
        return variantRepository.save(question);
    }

    @Override
    public Optional<Variant> findById(Long id) {
        return variantRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
    variantRepository.deleteById(id);
    }
}
