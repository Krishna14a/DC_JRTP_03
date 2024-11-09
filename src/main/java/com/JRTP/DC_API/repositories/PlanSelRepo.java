package com.JRTP.DC_API.repositories;

import com.JRTP.DC_API.entities.PlanEntity;
import com.JRTP.DC_API.entities.PlanSelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanSelRepo extends JpaRepository<PlanSelEntity,Integer> {

}
