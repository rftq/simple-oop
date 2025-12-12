public class Inventory {
    private int gold;
    private ConsumableItem[] items;

    public Inventory(int gold) {
        this.gold = gold;
        this.items = new ConsumableItem[10];
    }

    public void addGold(int amount) {
        this.gold += amount;
    }

    public void info() {
        System.out.println("Inventory");
        System.out.println("Gold: " + gold);
    }
}
