package com.mvpsports.sportsApp.repository;

import com.mvpsports.sportsApp.entity.Levels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelsRepository extends JpaRepository<Levels, Integer> {
}
