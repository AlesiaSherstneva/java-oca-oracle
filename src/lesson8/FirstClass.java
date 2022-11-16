package lesson8;

public class FirstClass {
    //first task
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static void divide(int d, int e) {
        System.out.printf("%d / %d = %d, remainder is %d\n", d, e, d / e, d % e);
    }

    //second task
    static final double pi = 3.14;

    public double circleArea(int radius) {
        return pi * radius * radius;
    }

    public static double circumference(int radius) {
        return 2 * pi * radius;
    }

    public void circleInfo(int radius) {
        System.out.printf("radius = %d; circumference = %.2f; circle area = %.2f\n",
                radius, circumference(radius), circleArea(radius));
    }
}
