package model;

import model.constants.Discounts;

public class Meat extends Food {
    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }

    public double getDiscount() {
        return Discounts.MEAT;
    }
}
