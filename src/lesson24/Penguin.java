package lesson24;

public class Penguin extends Bird {
    public String name;

    public Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Penguin likes to eat fish");
    }

    @Override
    public void sleep() {
        System.out.println("Penguins sleep huddled together");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can't fly");
    }

    @Override
    public void speak() {
        System.out.println("Penguins can't sing like nightingales");
    }
}