package lesson24;

public class Swordfish extends Fish {
    public String name;

    public Swordfish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Swordfish is a beautiful fish that swims fast");
    }

    @Override
    public void eat() {
        System.out.println("Swordfish is not a predatory fish and it eats regular fish food");
    }
}