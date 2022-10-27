package lesson2;

@SuppressWarnings("OctalInteger")
public class Homework {
    public static void main(String[] args) {
        System.out.println("1.");

        byte firstByte = 12, secondByte = 0xC, thirdByte = 0b1100, fourthByte = 0_14;
        short firstShort = -1300, secondShort = -0x514, thirdShort = -0b0101_0001_0100, fourthShort = -0_2424;
        int firstInt = 0, secondInt = 0x0, thirdInt = 0b0, fourthInt = 0_0;
        long firstLong = 123456789L, secondLong = 0x75B_CD15L,
                thirdLong = 0b0111_0101_1011_1100_1101_0001_0101L, fourthLong = 0_726_746_425L;

        System.out.println("---------------------------------------------------------");
        System.out.printf("%5s | %9s | %11s | %9s | %9s |\n", " ", "Decimal", "Hexadecimal", "Binary", "Octal");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%5s | %9d | %11d | %9d | %9d |\n", "byte", firstByte, secondByte, thirdByte, fourthByte);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%5s | %9d | %11d | %9d | %9d |\n", "short", firstShort, secondShort, thirdShort, fourthShort);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%5s | %9d | %11d | %9d | %9d |\n", "int", firstInt, secondInt, thirdInt, fourthInt);
        System.out.println("---------------------------------------------------------");
        System.out.printf("%5s | %9d | %11d | %9d | %9d |\n", "long", firstLong, secondLong, thirdLong, fourthLong);
        System.out.println("---------------------------------------------------------");

        System.out.println("2.");

        float firstFloat = 23.986F, secondFloat = -4567.123F;
        double firstDouble = 858.656, secondDouble = -0.259;
        boolean firstBoolean = true, secondBoolean = false;

        System.out.println("--------------------------------");
        System.out.printf("%7s | %8.3f | %9.3f |\n", "float", firstFloat, secondFloat);
        System.out.println("--------------------------------");
        System.out.printf("%7s | %8.3f | %9.3f |\n", "double", firstDouble, secondDouble);
        System.out.println("--------------------------------");
        System.out.printf("%7s | %8s | %9s |\n", "boolean", firstBoolean, secondBoolean);
        System.out.println("--------------------------------");

        System.out.println("3.");

        char firstChar = 'w', secondChar = 2732, thirdChar = '\u2732';

        System.out.println("-----------------------------");
        System.out.printf("%5s | %2s | %4s | %5s |\n", "char", "w", "2732", "'u2732'");
        System.out.println("-----------------------------");
        System.out.printf("%5s | %2s | %4s | %6s |\n", "value", firstChar, secondChar, thirdChar);
        System.out.println("-----------------------------");
    }
}
