public class Monster {
    private String name;
    private int hp;
    private int attack;

    public boolean isAlive() {
        return hp > 0; // короткий вариант
//        if (hp > 0) {
//            return true;
//        }
//        return false;
    }

    public Monster(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public void takeDamage(int amount) {
        this.hp -= amount;
    }

    public void info() {
        System.out.println(name + " " + hp + " " + attack);
    }

    public void attack(Hero hero) {
        System.out.println(name + " нанёс удар");
        hero.takeDamage(attack);
    }
}
