package com.aca.homework.week4.developer;

public class SeniorDeveloper extends Developer{
    public int getSalary(){
        return 3000000;
    }

    public int getLearningBudget() {
        return super.getLearningBudget() * 8;
    }
}
