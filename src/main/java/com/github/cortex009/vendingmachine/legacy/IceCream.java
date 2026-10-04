package com.github.cortex009.vendingmachine.legacy;

import java.util.List;

public class IceCream {
    List<Cone> cones;
    List<Topping> toppings;

    double getCost(){
        double totalCost = 0.0;
        for(Cone c:cones){
            totalCost += c.getCost();
        }
        for (Topping t: toppings){
            totalCost+=t.getCost();
        }
        return totalCost;
    }

    String getDescription() {
        return cones.toString()+toppings.toString();
    }
}
