package model;

public class Apple extends Food implements Discountable{
    private String color;
    public Apple(int amount, double price, String color){
        super(amount, price, true);
        this.color = color;
    }
    @Override
    public double getDiscount(){
        if(color == "red"){
            return 60.0;
        }
        else {
            return 0.0;
        }
    }
}
