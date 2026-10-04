package com.github.cortex009.vendingmachine.decorator.modifiers;

import com.github.cortex009.vendingmachine.decorator.components.IceCream;

public class StrawberryScoop implements IceCream {
    private static final double COST = 60.0;
    private final IceCream iceCream;
    public StrawberryScoop(IceCream newIceCream){
        this.iceCream = newIceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost()+COST;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+"StrawBerry Scoop";
    }
}
