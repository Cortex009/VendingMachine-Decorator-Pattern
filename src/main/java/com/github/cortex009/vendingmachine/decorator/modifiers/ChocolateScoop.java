package com.github.cortex009.vendingmachine.decorator.modifiers;

import com.github.cortex009.vendingmachine.decorator.components.IceCream;

public class ChocolateScoop implements IceCream {
    private static final double COST = 60.0;
    private final IceCream iceCream;

    public ChocolateScoop(IceCream newIceCream){
        this.iceCream = newIceCream;
    }
    @Override
    public double getCost() {
        return COST + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+"ChocolateScoop";
    }
}
