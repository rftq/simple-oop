public class Hero {
    private String name;
    private int hp;
    private Weapon weapon;
    private Inventory inventory;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.weapon = new Weapon("Sword", 20);
        this.inventory = new Inventory(100);
    }

    public void info() {
        System.out.println(name + " " + hp);
        inventory.info();
    }

    public void takeDamage(int amount) {
        this.hp -= amount;
    }

    public void attack(Monster monster) {
        System.out.println(name + " нанёс удар");
        monster.takeDamage(weapon.getDamage());
        if (!monster.isAlive()) {
            System.out.println("Монстр пал");
            int reward = (int)(Math.random() * 20 + 5);
            System.out.println(name + " в награду получает " + reward + " монет");
            inventory.addGold(reward);
            if (Math.random() < 0.4) {
                System.out.println(name + " нашёл предмет: склянка со здоровьем");
            }
        }
    }
}
