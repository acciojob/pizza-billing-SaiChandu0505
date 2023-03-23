package com.driver;


public class Pizza {

    public int totalPrice;
    public String bill;
    public int basePrice;
    public int cheesePrice;
    public int toppingsPrice;
    public int paperBagPrice;
    public boolean isCheeseAdded;
    public boolean isToppingsAdded;
    public boolean isPaperBagAdded;
    public boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        // your code goes here
        if(isVeg){
            basePrice = 300;
            toppingsPrice = 70;
        }
        else{
            basePrice = 400;
            toppingsPrice = 120;
        }
        cheesePrice = 80;
        paperBagPrice = 20;

        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperBagAdded = false;

        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: "+ basePrice+"\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            totalPrice = totalPrice + cheesePrice;
            isCheeseAdded = true;
        }
    }


    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded) {
            totalPrice = totalPrice + toppingsPrice;
            isToppingsAdded = true;
        }

    }


    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            totalPrice = totalPrice + paperBagPrice;
            isPaperBagAdded = true;
        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded){
                bill = bill +"Extra Cheese Added: "+ cheesePrice+ "\n";
            }
            if(isToppingsAdded){
                bill = bill + "Extra Toppings Added: "+ toppingsPrice+ "\n";
            }
            if(isPaperBagAdded){
                bill = bill+"Paperbag Added: "+ paperBagPrice+ "\n";
            }

            bill = bill+"Total Price: "+totalPrice + "\n";
            isBillGenerated=true;
        }
        return bill;
    }
}