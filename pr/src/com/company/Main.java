package com.company;

public class Main {

    public static void main(String[] args) {

        Mana mymana= new Mana(0.5,400,5);
        HP health = new HP(2.5,800,5);
        Person axe = new Person(5,5,"Axe",1,0);

        System.out.println("Ім`я героя : "+ axe.name+" , lvl: "+ axe.lvl+", статус : Сила -"+ axe.power+" , ловкість-"+ axe.dexterity);
        System.out.println("Мана: об'єм-"+ mymana.amount+" , регенерація-"+ mymana.regeneration +" , інтелект-"+ mymana.intelligence);
        System.out.println("Здоров'я : об'єм-"+ health.amount+" , регенерація-"+ health.regeneration +" , Витривалість-"+ health.endurance);
        System.out.println();

        axe.fight_lvl();
        System.out.println("Після бою втома піднялася до :"+ axe.fight_fatigue());
    }
}
