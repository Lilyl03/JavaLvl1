package com.aca.homework.week4.developer;

public class JuniorDeveloper extends Developer{
    public int getSalary(){
        return 300000;
    }

    public int getLearningBudget() {
        return super.getLearningBudget() * 2;
    }


}
