package com.company.DecoratorPattern;

import com.company.DecoratorPattern.interfaces.IceCream;
import com.company.DecoratorPattern.models.BasicIceCream;
import com.company.DecoratorPattern.models.MintIceCream;
import com.company.DecoratorPattern.models.VanillaIceCream;

public class Main {

    public static void main(String[] args) {
        IceCream basciIceCream = new BasicIceCream();
        System.out.println("Basic Ice-Cream costs: $" + basciIceCream.cost());

        IceCream vanillaIceCream = new VanillaIceCream(basciIceCream);
        System.out.println("Vanilla Ice-Cream costs: $" + vanillaIceCream.cost());

        IceCream mintIceCrem = new MintIceCream(vanillaIceCream);
        System.out.println("Mint Ice-Cream costs: $" + mintIceCrem.cost());
    }
}
