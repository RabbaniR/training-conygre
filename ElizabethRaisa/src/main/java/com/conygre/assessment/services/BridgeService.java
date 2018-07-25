package com.conygre.assessment.services;

import com.conygre.assessment.entities.Bridge;
import com.conygre.assessment.respos.BridgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BridgeService {
    @Autowired
    private BridgeRepository repo;

    public Collection<Bridge> getBridges() {
        return repo.findAll();
    }

    public void deleteBridge(int id) { repo.delete(id);}

    public void addBridge(Bridge b) {repo.save(b);}

    public Bridge containsBridge(int id) {
        return repo.findOne(id);
    }

    public void updateBridge(Bridge b) {
        repo.save(b);
    }

}
