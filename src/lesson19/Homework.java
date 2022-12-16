package lesson19;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        String[] strings1 = {"Hello", "Good bye", "Ok"};
        System.out.println("First base array: " + Arrays.toString(strings1));

        String[] strings2 = {"one", "two", "three", "four", "five"};
        System.out.println("Second base array: " + Arrays.toString(strings2));

        String[] strings3 = {"absolutely", "absolutely right", "right"};
        System.out.println("Third base array: " + Arrays.toString(strings3));

        System.out.println("\nArray received from abc() method:");
        String[] result = abc(strings1, strings2, strings3);
        System.out.println(Arrays.toString(result));

        if (args.length > 0) {
            for (String arg : args) {
                for (int j = 0; j < result.length; j++) {
                    if (arg.equals(result[j])) {
                        result[j] = null;
                    }
                }
            }
        }
        System.out.println("\nArray with replaced args:");
        System.out.println(Arrays.toString(result));
    }

    public static String[] abc(String[] ... stringArrays) {
        int length = 0;
        for (String[] array: stringArrays) {
            length += array.length;
        }
        String[] result = new String[length];
        int count = 0;
        for (String[] stringArray: stringArrays) {
            for (String string: stringArray) {
                result[count] = string;
                count++;
            }
        }
        return result;
    }
}