package com.slm.repository;

import com.slm.domain.Atm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AtmRepository extends JpaRepository<Atm,String> {
}
