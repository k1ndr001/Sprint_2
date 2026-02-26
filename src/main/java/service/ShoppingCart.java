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
        for (int i = 0; i < products.length; i++){
            Food product = products[i];
            total = total + product.getAmount() * product.getPrice();
        }
        return total;
    }
    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            Food product = products[i];
            total = total + product.getAmount() * product.getPrice() * (1 - product.getDiscount() / 100);
        }
        return total;
    }
    public double getVegetarianTotalWithoutDiscount(){
        double total = 0.0;
        for (int i = 0; i < products.length; i++){
            Food product = products[i];
            if (product.getIsVegatarian()){
                total = total + product.getAmount() * product.getPrice();
            }
        }
        return total;
    }
}
