package lesson8.firstTask;

public class FirstClass {
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static void divide(int d, int e) {
        System.out.printf("%d / %d = %d, remainder is %d\n", d, e, d / e, d % e);
    }
}
