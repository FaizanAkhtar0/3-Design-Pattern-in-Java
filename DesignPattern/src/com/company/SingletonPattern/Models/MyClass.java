package com.company.SingletonPattern.Models;

public class MyClass {
    // Eager creation of singelton pattern use only retun statement without any checks for this in getInstance();
    // private volatile static MyClass uniqueInstance = new MyClass();
    private volatile static MyClass uniqueInstance;

    public String name;

    private MyClass() {

    }

    //Double-Check Loacking.
    public static MyClass getInstance(){
        if (uniqueInstance == null){
            synchronized ((MyClass.class)){
                if (uniqueInstance == null){
                    uniqueInstance = new MyClass();
                }
            }
        }

        return uniqueInstance;
    }
}
