package com.JRTP.DC_API.repositories;

import java.util.List;

import com.JRTP.DC_API.entities.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppRepo extends JpaRepository<AppEntity, Long> {

    public List<AppEntity> fetchUserApps();

    @Query(value = "from AppEntity where userId =:userId")
    public List<AppEntity> fetchCwApps(Integer userId);

}