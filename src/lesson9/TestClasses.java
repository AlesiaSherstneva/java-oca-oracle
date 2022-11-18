package lesson9;

@SuppressWarnings("unused")
public class TestClasses {}

@SuppressWarnings("SameParameterValue")
class Test1 {
    int a = 1;
    //static int a = 2; //compile error
    void abc (int a) {
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}

@SuppressWarnings({"SameParameterValue", "unused"})
class Test2 {
    int a = 1;
    static int b = 2;
    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        System.out.println("Test2:");
        abc(5);
    }
}

@SuppressWarnings("SameParameterValue")
class Test3 {
    int a = 1;
    static int b = 2;
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        System.out.println("Test3:");
        Test3 t = new Test3();
        t.abc(4);
    }
}