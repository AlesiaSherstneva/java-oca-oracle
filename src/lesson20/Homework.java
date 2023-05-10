package lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        String[] unsortedStrings = {"Hello", "Good bye", "Hello again", "Good bye again", "Hi", "Hello", "Bye", "Good bye"};
        System.out.println("Base array of strings:\n" + Arrays.toString(unsortedStrings) + "\n");
        System.out.println("Sorted list of strings:\n" + abc(unsortedStrings));
    }

    public static List<String> abc(String... strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (!result.contains(string)) result.add(string);
        }
        Collections.sort(result);
        return result;
    }
}