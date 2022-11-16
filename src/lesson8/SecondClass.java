package lesson8;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println("1.");
        int a = 5, b = 8, c = 12;
        System.out.printf("%d * %d * %d = %d\n", a, b, c, FirstClass.multiply(a, b, c));
        a = 10;
        b = 100;
        c = 5;
        System.out.printf("%d * %d * %d = %d\n", a, b, c, FirstClass.multiply(a, b, c));

        FirstClass.divide(90, 8);
        FirstClass.divide(585, 17);

        System.out.println("2.");
        int radius = 4;
        System.out.printf("radius = %d; circumference = %.2f; ", radius, FirstClass.circumference(radius));
        FirstClass firstClass = new FirstClass();
        System.out.printf("circle area = %.2f\n", firstClass.circleArea(4));

        radius = 12;
        firstClass.circleInfo(radius);
    }
}
