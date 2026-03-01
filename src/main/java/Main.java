
import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Food meat = new Meat(5,100);
        Food redApples = new Apple(10,50, model.constants.Colour.RED);
        Food greenApples = new Apple(8, 60, model.constants.Colour.GREEN);

        Food [] products = {meat, redApples, greenApples};

        ShoppingCart cart = new ShoppingCart(products);

        System.out.printf("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.%n");
        System.out.printf("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.%n");
        System.out.printf("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount() + " руб.%n");
    }
}
