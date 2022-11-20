package lesson06;

@SuppressWarnings({"SameParameterValue", "UnusedReturnValue"})
public class OverloadedSum {
    int sum() {
        System.out.println("Method without parameters. Sum = 0");
        return 0;
    }

    int sum(int a) {
        System.out.println("Method with one parameter. Argument: " + a + ". Sum = " + a);
        return a;
    }

    int sum(int a, int b) {
        int result = a + b;
        System.out.println("Method with two parameters. Arguments: " + a + ", " + b + ". Sum = " + result);
        return result;
    }

    int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Method with three parameters. Arguments: " + a + ", " + b + ", " + c +
                ". Sum = " + result);
        return result;
    }

    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("Method with four parameters. Arguments: " + a + ", " + b + ", " + c +
                ", " + d + ". Sum = " + result);
        return result;
    }
}

class OverloadedSumTest {
    public static void main(String[] args) {
        OverloadedSum overloadedSum = new OverloadedSum();

        overloadedSum.sum();
        overloadedSum.sum(15);
        overloadedSum.sum(41, 6);
        overloadedSum.sum(100, 50, 36);
        overloadedSum.sum(150, 150, 200, 200);
    }
}