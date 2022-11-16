package lesson8.firstTask;

public class SecondClass {
    public static void main(String[] args) {
        int a = 5, b = 8, c = 12;
        System.out.printf("%d * %d * %d = %d\n", a, b, c, FirstClass.multiply(a, b, c));
        a = 10;
        b = 100;
        c = 5;
        System.out.printf("%d * %d * %d = %d\n", a, b, c, FirstClass.multiply(a, b, c));

        FirstClass.divide(90, 8);
        FirstClass.divide(585, 17);
    }
}
