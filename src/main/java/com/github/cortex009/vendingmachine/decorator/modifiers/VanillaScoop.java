package com.github.cortex009.vendingmachine.decorator.modifiers;

import com.github.cortex009.vendingmachine.decorator.components.IceCream;

public class VanillaScoop implements IceCream {
    private static final double COST = 50.0;
    private final IceCream iceCream;

    public VanillaScoop(IceCream newIceCream){
        this.iceCream = newIceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost()+COST;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+"Vanilla Scoop";
    }
}
