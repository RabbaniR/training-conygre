package com.conygre.assessment.contollers;

import com.conygre.assessment.entities.City;
import com.conygre.assessment.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityService service;

    @RequestMapping(method = RequestMethod.GET)
    Collection<City> getAllCities(){
        return service.getCities();
    }
}
