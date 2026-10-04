package com.github.cortex009.vendingmachine.decorator.components;

public class PaperCup implements IceCream{
    private static final double COST = 10;
    private final IceCream iceCream;

    public PaperCup(){
        this.iceCream = null;
    }
    public PaperCup(IceCream newIceCream){
        this.iceCream = newIceCream;
    }
    @Override
    public double getCost() {
        if(iceCream==null){
            return COST;
        }
        return COST + iceCream.getCost();
    }

    @Override
    public String getDescription() {
        if(iceCream==null){
            return  "PaperCup";
        }
        return iceCream.getDescription()+" "+"PaperCup";
    }
}
