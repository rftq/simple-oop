package oop;

public class Reward {
    private int gold;
    private ConsumableItem item;

    public int getGold() {
        return gold;
    }

    public ConsumableItem getItem() {
        return item;
    }

    public Reward(int gold, ConsumableItem item) {
        this.gold = gold;
        this.item = item;
    }
}
