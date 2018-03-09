package com.example.android.inclassassignment07_vilmariet;

import java.io.Serializable;


public class Drinks implements Serializable {
    public String drinkName;
    public String alcoholBase;
    public boolean ice;
    public int ingredients;

    public Drinks(String drinkName, String alcoholBase, boolean ice, int ingredients) {
        this.alcoholBase = alcoholBase;
        this.drinkName = drinkName;
        this.ice = ice;
        this.ingredients = ingredients;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setAlcoholBase(String alcoholBase) {
        this.alcoholBase = alcoholBase;
    }

    public String getAlcoholBase() {
        return alcoholBase;
    }

    public void isIce(boolean ice) {
        this.ice = ice;
    }

    public boolean getIce() {
        return ice;
    }

    public void setIngredients(int ingredients) {
        this.ingredients = ingredients;
    }

    public int getIngredients() {
        return ingredients;
    }


    public String toString() {
        return "Drink name: " + drinkName + "\nAlcohol Base: " + alcoholBase + "\nOn the rocks?: " + ice + "\nAdditional ingredients: " + ingredients + "\n \n";
    }
}
