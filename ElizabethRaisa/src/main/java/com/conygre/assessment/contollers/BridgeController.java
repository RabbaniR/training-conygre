package com.conygre.assessment.contollers;

import com.conygre.assessment.entities.Bridge;
import com.conygre.assessment.services.BridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PreUpdate;
import java.util.Collection;

@RestController
@RequestMapping("/bridges")
public class BridgeController {
    @Autowired
    private BridgeService service;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<Collection<Bridge>> getAllBridges(){
        Collection<Bridge> bridges = service.getBridges();
        if (bridges ==null) {
            return new ResponseEntity<Collection<Bridge>>(HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<Collection<Bridge>>(bridges, HttpStatus.OK);
        }
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteCompactDiscById(@PathVariable("id") int id) {
        service.deleteBridge(id);
    }

    @RequestMapping(method=RequestMethod.POST,
            consumes="application/json")
    public void addCompactDisc(@RequestBody Bridge p) {
        service.addBridge(p);
    }

    @RequestMapping(method=RequestMethod.PUT,
            consumes="application/json")
    public void updateBridge(@RequestBody Bridge b) {
        if (service.containsBridge(b.getId()) != null) {
            service.updateBridge(b);
        }

    }

}
