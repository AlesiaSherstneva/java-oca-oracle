package lesson24;

public abstract class Bird extends Animal implements Speakable {
    public String name;

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}