package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private final int vegBasePrice = 300;
    private final int noVegBasePrice = 400;
    private final int cheesePrice = 80;
    private final int vegToppingsPrice = 70;
    private final int nonVegToppingsPrice = 120;
    private final int bagPrice = 20;

    boolean cheeseAdded , topinsAdded , bagAdded, alreadyBilled ;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            this.price += vegBasePrice;
        else
            this.price += noVegBasePrice;

        this.bill = "Base price of the pizza:" + this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseAdded)
            return;
        cheeseAdded = true;
        this.price += cheesePrice;
    }

    public void addExtraToppings(){
        // your code goes here
        if(topinsAdded)
            return;
        topinsAdded = true;
        if(isVeg)
            this.price += vegToppingsPrice;
        else
            this.price += nonVegToppingsPrice;

    }

    public void addTakeaway(){
        // your code goes here
        if(bagAdded)
            return;
        bagAdded = true;
        this.price += bagPrice;
    }

    public String getBill(){
        // your code goes here
        if(alreadyBilled == false){
            alreadyBilled = true;
            if(cheeseAdded)
                this.bill += "Extra cheese Added:" + cheesePrice + "\n";

            if(topinsAdded){
                if(isVeg)
                    this.bill += "Extra Toppings Added:" + vegToppingsPrice + "\n";
                else
                    this.bill += "Extra Toppings Added:" + nonVegToppingsPrice + "\n";
            }

            if(bagAdded)
                this.bill += "PaperBag Added:" + bagPrice + "\n" ;

            this.bill += "Total Price:" + this.price + "\n";

        }
        return this.bill;
    }
}