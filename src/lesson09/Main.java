package lesson09;

@SuppressWarnings({"unused", "UnusedAssignment"})
public class Main {
    public static void main(String[] args) {
        TestObject object1 = new TestObject(1);
        TestObject object2 = new TestObject(2);
        TestObject object3 = new TestObject(3);
        TestObject object4 = new TestObject(4);
        TestObject object5 = new TestObject(5);
        TestObject object6 = new TestObject(6);
        TestObject object7 = new TestObject(7);
        TestObject object8 = new TestObject(8);

        object2 = object3 = object4 = object5 = object6 = object7 = null;

        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object3);
        System.out.println(object4);
        System.out.println(object5);
        System.out.println(object6);
        System.out.println(object7);
        System.out.println(object8);
    }
}

class TestObject {
    int value;

    public TestObject(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "object" + value + " exists";
    }
}
