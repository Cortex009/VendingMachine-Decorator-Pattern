package com.github.cortex009.vendingmachine.decorator;

import com.github.cortex009.vendingmachine.decorator.components.*;
import com.github.cortex009.vendingmachine.decorator.modifiers.*;

public class Client {
    public static void main(String[] args) {

//        Case 1: base OrangeCone (Only 1 ingredient) was included.
        System.out.println();
        System.out.println("Base IceCream");
        IceCream iceCream1 = new OrangeCone();
        System.out.println("Total Cost: "+iceCream1.getCost());
        System.out.println("Description : "+iceCream1.getDescription());

//        Case 2: added toppings(3 ingredients)
        System.out.println();
        System.out.println(" 3 ingredient Ice-Cream");
        IceCream iceCream2 = new ChocolateSyrup(new VanillaScoop(new ChocolateCone()));
        System.out.println(" Total Cost: "+ iceCream2.getCost());
        System.out.println(" Description: "+iceCream2.getDescription());

//        Case 3: Cone over a complete Ice Cream
        System.out.println();
        System.out.println(" Cone on top of an Ice Cream");
        IceCream iceCream3 = new ChocolateCone(new ChocolateSyrup(new ChocolateScoop(new OrangeCone())));
        System.out.println("Total Cost : "+iceCream3.getCost());
        System.out.println("Description: "+iceCream3.getDescription());

//        Case 4: The Works - baseCone Ice cream , added many toppings include a top cone over it
        System.out.println();
        System.out.println(" Cone on a large multi layer Ice Cream");
        IceCream iceCream4 = new ChocolateCone(
                new ChocoChips(
                        new RainbowSprinkles(
                                new ChocolateSyrup(
                                        new ChocolateScoop(
                                                new VanillaScoop(
                                                        new OrangeCone()
                                                )
                                        )
                                )
                        )
                )
        );
        System.out.println("Total Cost: "+iceCream4.getCost());
        System.out.println("Description: "+iceCream4.getDescription());

//        Case 5: Premium Waffle Cone with new fruit and caramel flavors
        System.out.println();
        System.out.println(" Premium Waffle Cone Combination");
        IceCream iceCream5 = new CaramelSyrup(
                new StrawberryScoop(
                        new VanillaScoop(
                                new WaffleCone()
                        )
                )
        );
        System.out.println("Total Cost: "+iceCream5.getCost());
        System.out.println("Description: "+iceCream5.getDescription());

//        Case 6: Non-edible base (Paper Cup) with nutty toppings
        System.out.println();
        System.out.println(" Paper Cup Sundae");
        IceCream iceCream6 = new RoastedAlmonds(
                new CaramelSyrup(
                        new ChocolateScoop(
                                new PaperCup()
                        )
                )
        );
        System.out.println("Total Cost: "+iceCream6.getCost());
        System.out.println("Description: "+iceCream6.getDescription());
    }
}
