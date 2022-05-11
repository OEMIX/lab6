package com.company;

public class Mana {
    double regeneration; // регенерація
    double amount; // об'єм
    int intelligence; // Інтелект

    public Mana (double regeneration, double amount, int intelligence){
        this.regeneration = regeneration;
        this.amount=amount;
        this.intelligence = intelligence;
    }
    void fight_Intelligence(){
        intelligence = intelligence + 5;
        System.out.println(" інтелект: "+ intelligence);
    }
    double fight_amount_mana(){
        double S;
        S = amount - 350;
        return S ;
    }
}
