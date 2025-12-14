package oop;

public class Inventory {
    private int gold;
    private ConsumableItem[] items;

    public Inventory(int gold) {
        this.gold = gold;
        this.items = new ConsumableItem[5];
    }

    public void addGold(int amount) {
        this.gold += amount;
    }

    public ConsumableItem takeItem(String title) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getTitle().equals(title)) {
                ConsumableItem out = items[i];
                items[i] = null;
                return out;
            }
        }
        return null;
    }

    // [null, null, null]
    public void addConsumableItem(ConsumableItem item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("В рюкзак добавлен предмет: " + item.getTitle());
                return;
            }
        }
        System.out.println("В рюкзаке нет места для: " + item.getTitle());
    }

    public void info() {
        System.out.println("oop.Inventory");
        System.out.println("Gold: " + gold);
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i].getTitle() + " " + items[i].getPower());
            }
        }
    }
}
