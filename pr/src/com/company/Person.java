package com.company;

import java.util.Scanner;

public class Person {
    int lvl; // уровень
    int power; // сила
    int dexterity; //ловкість
    String name; // імя
    int fatigue; //втома

    int initial_number = 2;

    Scanner sc = new Scanner(System.in);

    public Person(int power, int dexterity, String name, int lvl, int fatigue) {
        this.power = power;
        this.dexterity = dexterity;
        this.name = name;
        this.lvl = lvl;
        this.fatigue = fatigue;
    }

    void fight_lvl() {
        int attack;
        int training = (int) (Math.random() * initial_number+1);
        System.out.println("Щоб пеермогти противника потрібно провести точну атаку");
        System.out.println("Введіть число від 1 до "+initial_number);
        attack = sc.nextInt();
        if (attack == training) {
            System.out.println("перемога");
            lvl += 1;
        } else if (attack != training) {
            System.out.println("промах");
        }
    }

    int fight_fatigue() {
        fatigue = fatigue+50;
        return fatigue;
    }

}


