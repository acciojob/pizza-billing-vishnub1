package com.driver;

public class Pizza {

    protected int basePrice;
    protected boolean isVeg;
    protected boolean isBillGenerated;
    protected boolean addExtraCheese;
    protected boolean addExtraToppings;
    protected boolean addTakeaway;
    protected String bill;

    public Pizza(boolean isVeg, int basePrice){
        this.isVeg = isVeg;
        this.basePrice = basePrice;
        this.bill = "Base Price Of The Pizza: " + basePrice + "\n";
    }

    public int getPrice(){
        return basePrice;
    }

    public void addExtraCheese(){
        if (!addExtraCheese) {
            addExtraCheese = true;
            basePrice += 80;
            bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        if (!addExtraToppings) {
            addExtraToppings = true;
            basePrice += 70;
            bill += "Extra Toppings Added: 70\n";
        }
    }

    public void addTakeaway(){
        if (!addTakeaway) {
            addTakeaway = true;
            basePrice += 20;
            bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        if (!isBillGenerated) {
            bill += "Total Price: " + basePrice;
            isBillGenerated = true;
        }
        return bill;
    }
}
