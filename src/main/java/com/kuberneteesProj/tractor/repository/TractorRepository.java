package com.kuberneteesProj.tractor.repository;

import com.kuberneteesProj.tractor.entity.Tractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TractorRepository extends JpaRepository<Tractor,Long> {
    Tractor findByTractorId(Long tractorId);
    void deleteByTractorId(Long tractorId);

}
