package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products){
        this.products = products;
    }
    public  double getTotalPriceWithoutDiscount(){
        double total = 0.0;
        for (Food product : products){
            total = total + product.getAmount() * product.getPrice();
        }
        return total;
    }
    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (Food product : products) {
            total = total + product.getAmount() * product.getPrice() * (1 - product.getDiscount() / 100);
        }
        return total;
    }
    public double getVegetarianTotalWithoutDiscount(){
        double total = 0.0;
            for (Food product : products){
            if (product.getIsVegatarian()){
                total = total + product.getAmount() * product.getPrice();
            }
        }
        return total;
    }
}
