package service;

import model.Food;

public class ShoppingCart {
    private Food[] foodArray;

    public ShoppingCart(Food[] foodArray) {
        this.foodArray = foodArray;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Food food: foodArray){
            totalPrice += food.getAmount()*food.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount(){
        double totalPriceWithDiscount = 0;
        for (Food food: foodArray){
            totalPriceWithDiscount += food.getAmount()*food.getPrice()*(1-food.getDiscount()/100);
        }
        return totalPriceWithDiscount;
    }

    public double getTotalPriceForVegetarianFood(){
        double getTotalPriceForVegetarian = 0;
        for (Food food: foodArray) {
            if (food.isVegetarian()) {
                getTotalPriceForVegetarian += food.getAmount() * food.getPrice();
            }
        }
        return getTotalPriceForVegetarian;
    }

}
