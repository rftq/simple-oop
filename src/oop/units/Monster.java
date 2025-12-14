package oop.units;

import oop.Weapon;

public class Monster extends Unit {

    public Monster(String name, int maxHp) {
        this.level = 1;
        this.name = name;
        this.maxHp = maxHp;
        this.hp = this.maxHp;
        this.weapon = new Weapon("Палка с шипами", 1);
    }

    public void attack(Hero hero) {
        System.out.println(name + " нанёс удар");
        hero.takeDamage(weapon.getDamage());
    }
}
