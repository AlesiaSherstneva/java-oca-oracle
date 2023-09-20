package lesson24;

public class Penguin extends Bird {
    public String name;

    public Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Penguin likes to eat fish");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep huddled together");
    }

    @Override
    void fly() {
        System.out.println("Penguin can't fly");
    }

    @Override
    public void speak() {
        System.out.println("Penguins can't sing like nightingales");
    }
}