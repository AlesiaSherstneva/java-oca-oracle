package lesson22.secondTask;

public class Dog extends Pet {
    public Dog(String name) {
        this.name = name;
        System.out.printf("I am dog and my name is %s\n", name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}