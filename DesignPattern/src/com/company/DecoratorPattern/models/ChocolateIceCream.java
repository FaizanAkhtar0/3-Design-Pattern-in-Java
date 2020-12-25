package com.company.DecoratorPattern.models;

import com.company.DecoratorPattern.interfaces.IceCream;
import com.company.DecoratorPattern.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Chocolate to the ice-cream!");
        return 1.0 + super.cost();
    }
}
