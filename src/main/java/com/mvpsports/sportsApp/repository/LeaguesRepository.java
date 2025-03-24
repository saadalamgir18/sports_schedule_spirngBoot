package com.mvpsports.sportsApp.repository;

import com.mvpsports.sportsApp.entity.Leagues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaguesRepository extends JpaRepository<Leagues, Integer> {
}
