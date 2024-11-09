package com.JRTP.DC_API.repositories;


import com.JRTP.DC_API.entities.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepo extends JpaRepository<PlanEntity, Integer> {
}