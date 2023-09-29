package lesson24;

public abstract class Mammal extends Animal implements Speakable {
    public String name;

    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    public abstract void run();
}