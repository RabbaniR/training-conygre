package com.conygre.assessment.respos;

import com.conygre.assessment.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
