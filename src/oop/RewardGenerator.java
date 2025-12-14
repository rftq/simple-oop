package oop;

import oop.units.Monster;

public class RewardGenerator {
    public static Reward generateRewardFromMonster(Monster monster) {
        int gold = 5 + (int)(Math.random() * (20 + monster.getLevel() * 5));
        return new Reward(10, new ConsumableItem("Склянка со здоровьем", 5));
    }
}
