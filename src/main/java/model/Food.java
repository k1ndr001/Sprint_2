package model;

public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;
    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
        public double getAmount(){
            return amount;
        }
        public double getPrice(){
            return price;
        }
        public boolean getIsVegatarian(){
        return isVegetarian;
        }
    @Override
    public double getDiscount() {
        return 0;
    }
}
