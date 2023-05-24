package lesson22.secondTask;

public class Pet extends Animal {
    public String name;
    public int tail = 1;
    public int paw = 4;

    public Pet() {
        this.eyes = 2;
        System.out.println("I am pet");
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}