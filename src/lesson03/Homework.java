package lesson03;

@SuppressWarnings("ConstantConditions")
public class Homework {
    public static void main(String[] args) {
        int i1 = 5, i2 = 11;
        double d1 = 5.5, d2 = 1.3;
        long l = 20L;

        System.out.println("1.\n" + "i2 / d1 + d2 % i1 - l = " + (i2 / d1 + d2 % i1 - l) + "\n2.");
        int a = 5, b = 8;
        System.out.println("a-- - --a + ++a + a++ + a = " + (a-- - --a + ++a + a++ + a));
        System.out.println("++b - b++ + ++b - --b = " + (++b - b++ + ++b - --b));
    }
}
