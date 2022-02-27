package com.aca.homework.week4.developer;

public class DeveloperTest {
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        developer1.setName("Gerard");
        Developer developer2 = new JuniorDeveloper();
        developer2.setName("Maricar");
        Developer developer3 = new SeniorDeveloper();
        developer3.setName("Emily");
        Developer[] developers = {developer1,developer2,developer3};
        for(int i = 0; i < developers.length; i++){
            System.out.println("Name: " + developers[i].getName() + " Salary: " + developers[i].getSalary() + " learning-budget: " + developers[i].getLearningBudget());
        }
    }
}
