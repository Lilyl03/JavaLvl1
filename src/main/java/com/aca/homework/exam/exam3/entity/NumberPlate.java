package com.aca.homework.exam.exam3.entity;

import javax.persistence.*;

@Entity
@Table(name = "NUMBERPLATES")
public class NumberPlate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numberplate", unique = true, nullable = false)
    private String numberPlates;


    public NumberPlate(String numberPlates) {
        this.numberPlates = numberPlates;
    }

    public NumberPlate() {
    }

    public String getNumberPlates() {
        return numberPlates;
    }

    public void setNumberPlates(String numberPlates) {
        this.numberPlates = numberPlates;
    }


}
