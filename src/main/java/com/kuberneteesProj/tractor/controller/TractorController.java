package com.kuberneteesProj.tractor.controller;

import com.kuberneteesProj.tractor.entity.Tractor;
import com.kuberneteesProj.tractor.service.TractorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tractors")
@Slf4j
public class TractorController {
    @Autowired
    private TractorService tractorService;
    @PostMapping("/")
    public Tractor saveDepartment(@RequestBody Tractor tractor){
        log.info("saveDepartment method controller");
        return tractorService.saveTractor(tractor);
    }

    @GetMapping("/{id}")
    public Tractor findDepartmentById(@PathVariable("id") Long tractorId){
        log.info("saveDepartment method controller");
        return tractorService.findByTractorId(tractorId);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Tractor> updateTractor(@PathVariable("id") Long tractorId, @RequestBody Tractor tractor){
        log.info("updateTractor method controller");
        Tractor existingTractor = tractorService.findByTractorId(tractorId);
        if (existingTractor == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        tractor.setTractorId(tractorId);
        Tractor updatedTractor = tractorService.saveTractor(tractor);
        return new ResponseEntity<>(updatedTractor, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTractor(@PathVariable("id") Long tractorId){
        log.info("deleteTractor method controller");
        Tractor existingTractor = tractorService.findByTractorId(tractorId);
        if (existingTractor == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        tractorService.deleteTractor(tractorId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
