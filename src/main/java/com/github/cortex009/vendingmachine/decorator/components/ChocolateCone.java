package com.github.cortex009.vendingmachine.decorator.components;

public class ChocolateCone implements IceCream{
    private static final double COST = 30;
    private final IceCream iceCream;

    public ChocolateCone(){
        this.iceCream = null;
    }
    public ChocolateCone(IceCream newIceCream){
        this.iceCream = newIceCream;
    }

    @Override
    public double getCost() {
        if(iceCream==null) return COST;
        return iceCream.getCost()+COST;
    }

    @Override
    public String getDescription() {
        if (iceCream== null) return "Chocolate Cone";
        return iceCream.getDescription()+" and "+"Chocolate Cone";
    }
}
