package com.driver;

public class DeluxePizza extends Pizza {


    private int price;
    private Boolean isVeg;
    private String bill;

    public DeluxePizza(Boolean isVeg, int price, Boolean isVeg1, String bill) {
        super(isVeg);
        this.price = price;
        this.isVeg = isVeg1;
        this.bill = bill;
    }
    public DeluxePizza(Boolean isVeg) {
        // your code goes here
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();

    }
    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    @Override
    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }
}
