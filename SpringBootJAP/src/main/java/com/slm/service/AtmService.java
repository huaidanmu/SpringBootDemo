package com.slm.service;

import com.slm.domain.Atm;
import com.slm.repository.AtmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AtmService {
    @Autowired
    private AtmRepository repository;
    public List<Atm> findAll(){
        return repository.findAll();
    }
}
