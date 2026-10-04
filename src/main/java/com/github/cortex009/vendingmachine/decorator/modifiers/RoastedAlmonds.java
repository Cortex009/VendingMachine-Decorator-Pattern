package com.github.cortex009.vendingmachine.decorator.modifiers;

import com.github.cortex009.vendingmachine.decorator.components.IceCream;

public class RoastedAlmonds implements IceCream {
    private static final double COST = 15.0;
    private final IceCream iceCream;
    public RoastedAlmonds(IceCream newIceCream){
        this.iceCream = newIceCream;
    }
    @Override
    public double getCost() {
        return iceCream.getCost()+COST;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription()+" "+"Roasted Almonds";
    }
}
