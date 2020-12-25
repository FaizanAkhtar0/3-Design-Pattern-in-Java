package com.company.DecoratorPattern.models;

import com.company.DecoratorPattern.interfaces.IceCream;
import com.company.DecoratorPattern.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla to the ice-cream!");
        return 1.0 + super.cost();
    }
}
