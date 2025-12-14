package oop.units;

import oop.Weapon;

public class Unit {
    int level;
    String name;
    int hp;
    int maxHp;
    Weapon weapon;

    public void info() {
        System.out.println();
        System.out.println("NAME: " + name + " HP: " + hp + "/" + maxHp + " DMG: " + weapon.getDamage());
    }

    public void heal(int amount) {
        hp += amount;
        if (hp > maxHp) {
            hp = maxHp;
        }
    }

    public void takeDamage(int amount) {
        this.hp -= amount;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return hp > 0; // короткий вариант
    }

}
