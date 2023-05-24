package lesson22.secondTask;

public class Cat extends Pet {
    public Cat(String name) {
        this.name = name;
        System.out.printf("I am cat and my name is %s\n", name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}