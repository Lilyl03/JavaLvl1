package com.aca.homework.week7.singleton;

public class SingletonUserService {
    private static SingletonUserService singletonUserService;
    private SingletonUserService() {
    }
    public static SingletonUserService getInstance(){
        if(singletonUserService != null){
            return singletonUserService;
        }else{
            return singletonUserService = new SingletonUserService();
        }
    }
}
