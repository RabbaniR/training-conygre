package com.conygre.spring.service;


import com.conygre.spring.data.respos.CompactDiscRepository;
import com.conygre.spring.entities.CompactDisc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
@Service
@Transactional (propagation = Propagation.REQUIRED)
public class CompactDiscService {
	
	@Autowired	
	private CompactDiscRepository repository;
	

	@Transactional (propagation = Propagation.REQUIRES_NEW)
	public void addToCatalog(CompactDisc disc) {
		repository.save(disc);
	}
	
	public Collection<CompactDisc> getCatalog() {
		return repository.findAll();
	}

	public Collection<CompactDisc> getByArtist(String artist) { return repository.find(artist);}

/*	public CompactDisc getCompactDiscById(int id) {
		return repository.findOne(id);
	}
	
	private static Collection<CompactDisc> makeCollection(Iterable<CompactDisc> iter) {
	    Collection<CompactDisc> list = new ArrayList<>();
	    for (CompactDisc item : iter) {
	        list.add(item);
	    }
	    return list;
	}*/
}
