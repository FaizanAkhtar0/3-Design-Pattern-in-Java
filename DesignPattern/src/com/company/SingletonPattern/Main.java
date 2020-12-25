package com.company.SingletonPattern;

import com.company.SingletonPattern.Models.MyClass;
import com.company.SingletonPattern.Models.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        MyClass myClass = MyClass.getInstance();
        MyClass mySecondClass = MyClass.getInstance();

        myClass.name = "Alex";
        System.out.println(myClass);
        System.out.println(mySecondClass);

        System.out.println("Object Person: " + person);
    }
}
