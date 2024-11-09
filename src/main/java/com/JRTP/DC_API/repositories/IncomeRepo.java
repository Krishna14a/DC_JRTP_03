package com.JRTP.DC_API.repositories;

import com.JRTP.DC_API.entities.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepo extends JpaRepository<IncomeEntity,Integer> {
}
