public class Weapon {
    private String title;
    private int damage;

    public int getDamage() {
        return damage;
    }

    public Weapon(String title, int damage) {
        this.title = title;
        this.damage = damage;
    }
}
