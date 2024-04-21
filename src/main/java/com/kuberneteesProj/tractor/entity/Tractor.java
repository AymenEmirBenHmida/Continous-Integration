package com.kuberneteesProj.tractor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tractor  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tractorId;
    private String brand;
    private String model;
    private int manufactureYear;
    private double price;
}
