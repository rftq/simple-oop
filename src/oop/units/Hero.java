package oop.units;

import oop.*;

public class Hero extends Unit {
    private Inventory inventory;

    public Hero(String name, int maxHp) {
        this.level = 1;
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.weapon = new Weapon("Меч", 20);
        this.inventory = new Inventory(100);
    }

    @Override
    public void info() {
        super.info();
        inventory.info();
    }

    public void attack(Monster monster) {
        System.out.println(name + " нанёс удар");
        monster.takeDamage(weapon.getDamage());
        if (!monster.isAlive()) {
            System.out.println("Монстр пал");
            Reward reward = RewardGenerator.generateRewardFromMonster(monster);
            System.out.println(name + " в награду получает " + reward.getGold() + " монет");
            inventory.addGold(reward.getGold());
            if (reward.getItem() != null) {
                System.out.println(name + " нашёл предмет: " + reward.getItem().getTitle());
                inventory.addConsumableItem(reward.getItem());
            }
        }
    }

    public void useItem(String title) {
        ConsumableItem item = inventory.takeItem(title);
        if (item == null) {
            System.out.println("В рюкзаке нет такого предмета: " + item);
            return;
        }
        if (item.getTitle().equals("Склянка со здоровьем")) {
            heal(item.getPower());
            System.out.println(name + " выпил зелье и получил " + item.getPower() + " едениц здоровья");
        }


    }
}
