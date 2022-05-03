package com.aca.homework.exam.exam3.entity;

import javax.persistence.*;

public class UserPlateNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_NUMBERPLATE_USER_ID_ID"))
    private User user;

    @JoinColumn(name = "numberplate_id", foreignKey = @ForeignKey(name = "FK_NUMBERPLATE_USER_ID_ID"))
    private NumberPlate numberPlate;

    public UserPlateNumber(User user, NumberPlate numberPlate) {
        this.user = user;
        this.numberPlate = numberPlate;
    }

    public UserPlateNumber() {
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NumberPlate getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(NumberPlate numberPlate) {
        this.numberPlate = numberPlate;
    }
}
