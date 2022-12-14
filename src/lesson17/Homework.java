package lesson17;

public class Homework {
    public static void main(String[] args) {
        printResults(new StringBuilder("Hello!"), new StringBuilder("Hello!"));
        printResults(new StringBuilder("Hello!"), new StringBuilder("hello!"));
    }

    // это метод ravenstvo :-)
    static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        return sb1.toString().equals(sb2.toString());
    }

    public static void printResults(StringBuilder sb1, StringBuilder sb2) {
        System.out.println("Objects \"" + sb1 + "\" and \"" + sb2 + "\" are"
                + (equality(sb1, sb2) ? "" : " not") + " equals");
    }
}