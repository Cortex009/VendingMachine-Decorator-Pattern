package com.github.cortex009.vendingmachine.decorator.components;

public class OrangeCone implements IceCream{
    private static final double COST = 25;
    private final IceCream icecream;

    public OrangeCone(){
        this.icecream = null;
    }

    public OrangeCone(IceCream newIceCream){
        this.icecream = newIceCream;
    }

    @Override
    public double getCost() {
        if (icecream == null) return COST;
        return COST + icecream.getCost();
    }

    @Override
    public String getDescription() {
        if(icecream == null) return "OrangeCone";
        return icecream.getDescription()+" "+"OrangeCone";
    }
}
