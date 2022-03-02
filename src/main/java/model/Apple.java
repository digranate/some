package model;

import model.constants.Discounts;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = colour;
    }

    public double getDiscount() {
        return 1;
    }
}
