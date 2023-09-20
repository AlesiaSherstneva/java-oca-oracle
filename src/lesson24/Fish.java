package lesson24;

public abstract class Fish extends Animal {
    public String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("It's always interesting to watch the fish sleeping");
    }

    abstract void swim();
}