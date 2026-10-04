# Dynamic Vending Machine Engine

A Java 24 backend engine demonstrating the **Decorator Design Pattern**. This project models a highly customizable vending system where prices and descriptions are calculated dynamically based on an arbitrary number of nested modifiers (toppings, scoops) and components (cones, cups).

## 🚀 Technical Highlights
*   **Legacy vs. Modern Architecture:** Includes a `legacy` package demonstrating the rigid, tightly-coupled collection-based approach, contrasted with the `decorator` package showcasing dynamic object composition.
*   **Open/Closed Principle:** New inventory items (like Waffle Cones or Caramel Syrup) are added by implementing the base interface without modifying existing engine logic.
*   **Recursive Calculation:** Cost and description generation recursively bubble up through the layers of instantiated objects.

## 🏗️ Project Structure
*   `legacy/`: Contains the pre-refactoring collection-bound implementation.
*   `decorator/components/`: Foundational base contracts (`IceCream`, `OrangeCone`, `ChocolateCone`, `WaffleCone`, `PaperCup`).
*   `decorator/modifiers/`: Recursive wrappers (`VanillaScoop`, `ChocolateScoop`, `ChocoChips`, `CaramelSyrup`, `RoastedAlmonds`, etc.).
*   `decorator/Client`: The execution driver showcasing infinite nesting combinations.

## 💻 Code Example
```java
// Dynamically building a premium multi-layered sundae at runtime
IceCream iceCream = new RoastedAlmonds(
                        new CaramelSyrup(
                            new ChocolateScoop(
                                new PaperCup()
                            )
                        )
                    );
System.out.println(iceCream.getCost());