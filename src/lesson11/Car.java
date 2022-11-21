package lesson11;

public class Car {
    public String color;
    public String engine;
    public int countOfDoors;

    public Car(String color, String engine, int countOfDoors) {
        this.color = color;
        this.engine = engine;
        this.countOfDoors = countOfDoors;
    }
}

class CarTest {
    public static void changeDoors(Car car, int doors) {
        car.countOfDoors = doors;
    }

    public static void changeColors(Car car1, Car car2) {
        String tempColor = car2.color;
        car2.color = car1.color;
        car1.color = tempColor;
    }

    public static void main(String[] args) {
        Car firstCar = new Car("green", "V6", 4);

        System.out.printf("First car has %d doors\n", firstCar.countOfDoors);
        changeDoors(firstCar, 2);
        System.out.printf("Now first car has %d doors\n", firstCar.countOfDoors);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        Car secondCar = new Car("blue", "V12", 5);

        System.out.printf("First car has %s color\n", firstCar.color);
        System.out.printf("Second car has %s color\n", secondCar.color);
        changeColors(firstCar, secondCar);
        System.out.printf("Now first car has %s color\n", firstCar.color);
        System.out.printf("Now second car has %s color\n", secondCar.color);
    }
}