package lesson24;

public class Lion extends Mammal{
    public String name;

    public Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lion, like any predator, loves meat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps for most of the day");
    }

    @Override
    public void run() {
        System.out.println("Lion is not the fastest cat");
    }
}