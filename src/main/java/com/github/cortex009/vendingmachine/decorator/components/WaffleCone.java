package com.github.cortex009.vendingmachine.decorator.components;

public class WaffleCone implements IceCream{
    private static final double COST = 45.0;
    private final IceCream iceCream;

    public WaffleCone(){
        this.iceCream = null;
    }

    public WaffleCone(IceCream newIceCream){
        this.iceCream = newIceCream;
    }
    @Override
    public double getCost() {
        if (iceCream == null){
            return COST;
        }
        return COST + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        if(iceCream == null) {
            return "Waffle Cone";
        }
        return iceCream.getDescription()+ " and Waffle Cone";
    }
}
