package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVeg) {
        super(isVeg, 400); // Deluxe pizza has a base price of 400
        addExtraCheese(); // Deluxe pizza comes with extra cheese by default
        addExtraToppings(); // Deluxe pizza comes with extra toppings by default
    }
}
