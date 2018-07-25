package com.conygre.spring.controller;

import com.conygre.spring.entities.CompactDisc;
import com.conygre.spring.service.CompactDiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/compactdisc")
public class CompactDiscController {

    @Autowired
    private CompactDiscService compactDiscService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<CompactDisc> getAllDiscs() {
        return compactDiscService.getCatalog();
    }
/*
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public CompactDisc getDiscById(@PathVariable("id") int id) {
        return compactDiscService.getCompactDiscById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCompactDisc(@RequestBody  CompactDisc disc) {
        compactDiscService.addToCatalog(disc);
    }*/


}
