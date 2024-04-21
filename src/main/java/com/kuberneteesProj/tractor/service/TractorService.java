package com.kuberneteesProj.tractor.service;

import com.kuberneteesProj.tractor.entity.Tractor;
import com.kuberneteesProj.tractor.repository.TractorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TractorService {
    @Autowired
    private TractorRepository tractorRepository;

    public Tractor saveTractor(Tractor tractor) {
        log.info("saveDepartment method service");
        return tractorRepository.save(tractor);
    }

    public Tractor findByTractorId(Long tractorId) {
        log.info("findDepartmentById method service");
        return tractorRepository.findByTractorId(tractorId);

    }

    public void deleteTractor(Long tractorId) {
        log.info("findDepartmentById method service");
        tractorRepository.deleteById(tractorId);

    }
}
