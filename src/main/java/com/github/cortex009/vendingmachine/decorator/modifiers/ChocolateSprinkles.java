package com.github.cortex009.vendingmachine.decorator.modifiers;

import com.github.cortex009.vendingmachine.decorator.components.IceCream;

public class ChocolateSprinkles implements IceCream {
    private static final double COST = 10.0;
    private final IceCream iceCream;

    public ChocolateSprinkles(IceCream newIceCream){
        this.iceCream = newIceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost() + COST;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+"ChocolateSprinkles";
    }
}
