package lesson17;

public class Homework {
    // это метод ravenstvo :-)
    static boolean equality(StringBuilder sb1, StringBuilder sb2) {
        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello!");
        StringBuilder sb2 = new StringBuilder("Hello!");
        StringBuilder sb3 = new StringBuilder("Good bye!");

        System.out.println("Objects \"" + sb1 + "\" and \"" + sb2 + "\" are"
                + (equality(sb1, sb2) ? "" : "not") + " equals");
        System.out.println("Objects \"" + sb1 + "\" and \"" + sb3 + "\" are "
                + (equality(sb1, sb3) ? "" : "not") + " equals");
    }
}