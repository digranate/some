import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args){
        Meat meat  = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);
        Food[] foodArray = new Food[3];
        foodArray[0] = meat;
        foodArray[1] = redApple;
        foodArray[2] = greenApple;
        ShoppingCart shoppingCart = new ShoppingCart(foodArray);
        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getTotalPriceWithDiscount());
        System.out.println(shoppingCart.getTotalPriceForVegetarianFood());
    }
}
