package lesson25;

import lesson24.Animal;
import lesson24.Bird;
import lesson24.Fish;
import lesson24.Lion;
import lesson24.Mammal;
import lesson24.Penguin;
import lesson24.Speakable;
import lesson24.Swordfish;

public class Homework {
    public static void main(String[] args) {
        Animal swordfish1 = new Swordfish("animal-swordfish");
        Fish swordfish2 = new Swordfish("fish-swordfish");
        Swordfish swordfish3 = new Swordfish("swordfish-swordfish");

        Animal penguin1 = new Penguin("animal-penguin");
        Bird penguin2 = new Penguin("bird-penguin");
        Speakable penguin3 = new Penguin("speakable-penguin");
        Penguin penguin4 = new Penguin("penguin-penguin");

        Animal lion1 = new Lion("animal-lion");
        Mammal lion2 = new Lion("mammal-lion");
        Speakable lion3 = new Lion("speakable-lion");
        Lion lion4 = new Lion("lion-lion");

        Speakable[] speakableArray = {penguin2, penguin3, penguin4, lion2, lion3, lion4};
        Animal[] animalArray = {swordfish1, swordfish2, swordfish3, penguin1, penguin2, penguin4, lion1, lion2, lion4};

        System.out.println("Speakable array:");
        for (Speakable speakable: speakableArray) {
            System.out.println("~".repeat(63));
            speakable.speak();
            if (speakable instanceof Animal) {
                System.out.println(((Animal) speakable).name);
                ((Animal) speakable).eat();
                ((Animal) speakable).sleep();
            }
            if (speakable instanceof Bird) {
                ((Bird) speakable).fly();
            }
            if (speakable instanceof Mammal) {
                ((Mammal) speakable).run();
            }
        }

        System.out.println("-".repeat(63));

        System.out.println("Animal array:");
        for (Animal animal: animalArray) {
            System.out.println("~".repeat(63));
            System.out.println(animal.name);
            animal.eat();
            animal.sleep();
            if (animal instanceof Speakable) {
                ((Speakable) animal).speak();
            }
            if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            }
        }
    }
}