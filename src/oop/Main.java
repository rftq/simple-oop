package oop;

import oop.units.Hero;
import oop.units.Monster;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Bob", 10);
        Monster monster = new Monster("Goblin", 6);
//        hero.name = "Bob";
//        hero.hp = 10;
//        hero.attack = 1;

        hero.info();
        monster.info();

        hero.attack(monster);
        if (monster.isAlive()) {
            monster.attack(hero);
        }

        hero.useItem("Склянка со здоровьем");

        hero.info();
        monster.info();
    }
}