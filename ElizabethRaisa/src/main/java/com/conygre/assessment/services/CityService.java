package com.conygre.assessment.services;

import com.conygre.assessment.entities.City;
import com.conygre.assessment.respos.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CityService {
    @Autowired
    private CityRepository repo;

    public Collection<City> getCities() {
        return repo.findAll();
    }
}
