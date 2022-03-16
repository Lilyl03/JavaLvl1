package com.aca.homework.week3.covidtest;

public class CovidTest {
    User[] user;
    String positive;
    CovidTest[] results;

    public static void main(String[] args) {
       User user1 = new User();
        user1.name = "Mark";
        user1.code = "mark789";
        User user2 = new User();
        user2.name = "Jane";
        user2.code = "jane45";
        User user3 = new User();
        user3.name = "Kate";
        user3.code = "kate876&";
        User[] users = {user1,user2,user3};
        CovidTest covidTest1 = new CovidTest();
        covidTest1.positive = "positive";
        CovidTest covidTest2 = new CovidTest();
        covidTest2.positive = "positive";
        CovidTest covidTest3 = new CovidTest();
        covidTest3.positive = "negative";
        CovidTest[] covidTests = {covidTest1,covidTest2,covidTest3};
        CovidTest covidTest = new CovidTest();
        covidTest.results = covidTests;
        covidTest.user = users;
       // printCovidTest(covidTest);
        covidTest.print();
    }
    public static void printCovidTest(CovidTest covidTest){
        for(int i =0; i< covidTest.user.length; i++){
        System.out.println("User name: " + covidTest.user[i].name + " code: " + covidTest.user[i].code + " Covid Test Results: " + covidTest.results[i].positive);
        }
    }
    public  void print(){
        for(int i = 0; i  < user.length; i++){
        user[i].print();
        System.out.println( " Covid Test Results: " + results[i].positive);
    }}

}