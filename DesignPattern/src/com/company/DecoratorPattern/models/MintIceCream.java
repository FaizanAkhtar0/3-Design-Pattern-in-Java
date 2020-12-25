package com.company.DecoratorPattern.models;

import com.company.DecoratorPattern.interfaces.IceCream;
import com.company.DecoratorPattern.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding mint to the ice-cream!");
        return 1.50 + super.cost();
    }
}
