# Builder Pattern Assignment - Pizza
This repository contains the implementation of the Builder creational design pattern in Java.

## Product Description
The chosen product is a `Pizza` which benefits from step-by-step construction because different pizzas require different combinations of dough, sauces, and toppings.

## How to Build Representations
- `MargheritaPizzaBuilder` creates a thin-crust pizza with tomato sauce and basil.
- `PepperoniPizzaBuilder` creates a thick-crust pizza with BBQ sauce and pepperoni.
  The `Waiter` (Director) orchestrates the fluent API sequence (`buildDough().buildSauce().buildTopping().build()`).

## How to Run
Compile all `.java` files in your IDE and run the `Main` class to see the client output in the console.