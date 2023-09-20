package lesson24;

public class Homework {
    public static void main(String[] args) {
        Swordfish swordfish = new Swordfish("Nemo");
        System.out.println(swordfish.name);
        swordfish.eat();
        swordfish.sleep();
        swordfish.swim();

        System.out.println("~".repeat(63));

        Speakable penguin = new Penguin("Lolo");
        penguin.speak();

        System.out.println("~".repeat(63));

        Animal lion1 = new Lion("Alex");
        System.out.println(lion1.name);
        lion1.eat();
        lion1.sleep();

        System.out.println("~".repeat(63));

        Mammal lion2 = new Lion("Simba");
        System.out.println(lion2.name);
        lion2.eat();
        lion2.sleep();
        lion2.run();
        lion2.speak();
    }
}