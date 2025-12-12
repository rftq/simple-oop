public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Bob", 10);
        Monster monster = new Monster("Goblin", 6, 2);
//        hero.name = "Bob";
//        hero.hp = 10;
//        hero.attack = 1;

        hero.info();
        monster.info();

        hero.attack(monster);
        monster.attack(hero);

        hero.info();
        monster.info();
    }
}