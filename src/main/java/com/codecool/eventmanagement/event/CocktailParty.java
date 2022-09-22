package com.codecool.eventmanagement.event;

import com.codecool.eventmanagement.employee.ChiefOrganiser;

public class CocktailParty extends Event {
    int cocktailAmount;

    public CocktailParty(ChiefOrganiser chiefOrganiser, int cocktailAmount) {
        super(chiefOrganiser);
        this.cocktailAmount = cocktailAmount;
    }

    public void giveCocktail() {
        if (cocktailAmount < 1) {
            System.out.println("Sorry no cocktails");
            return;
        }
        cocktailAmount--;
        System.out.println("Here is your cocktail");
    }
}
