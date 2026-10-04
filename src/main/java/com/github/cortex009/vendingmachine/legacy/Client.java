package com.github.cortex009.vendingmachine.legacy;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        IceCream legacyIceCream = new IceCream();

        legacyIceCream.cones = new ArrayList<>();
        legacyIceCream.toppings = new ArrayList<>();

        legacyIceCream.cones.add(new Cone() {
            @Override
            public double getCost() { return 30.0; }
            @Override
            public String getDescription() { return "Legacy Chocolate Cone"; }
        });

        legacyIceCream.toppings.add(new Topping() {
            @Override
            public double getCost() { return 15.0; }
            @Override
            public String getDescription() { return "Legacy Choco Chips"; }
        });

        System.out.println("Legacy Cost: " + legacyIceCream.getCost());
        System.out.println("Legacy Description: " + legacyIceCream.getDescription());
    }
}