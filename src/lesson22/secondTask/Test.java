package lesson22.secondTask;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack");
        System.out.printf("The dog has %d paws\n", dog.paw);

        System.out.println("~".repeat(30));

        Cat cat = new Cat("Mickey");
        cat.sleep();
    }
}