package com.mvpsports.sportsApp.repository;

import com.mvpsports.sportsApp.entity.Sports;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportsRepository extends JpaRepository<Sports, Integer> {

}
