package lesson18;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        System.out.println("1.");
        int[] intArray = {1, 6, -4, 0, 456, -17, 74, 2};
        System.out.println("Unsorted array:\n" + Arrays.toString(intArray));
        System.out.println("Sorted array:\n" + Arrays.toString(sorting(intArray)));

        System.out.println("2.");
        String[][] stringArray = {{"element00", "element01", "element02"}, {"element10", "element11", "element12"}};
        showArray(stringArray);
    }

    // метод sortirovka (обычный bubble sort)
    static int[] sorting(int[] arrayToSort) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayToSort.length - 1; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    isSorted = false;
                    int temp = arrayToSort[i + 1];
                    arrayToSort[i + 1] = arrayToSort[i];
                    arrayToSort[i] = temp;
                }
            }
        }
        return arrayToSort;
    }

    static void showArray(String[][] arrayToShow) {
        StringBuilder output = new StringBuilder("{ ");
        for (int i = 0; i < arrayToShow.length; i++) {
            output.append("{");
            for (int j = 0; j < arrayToShow[i].length; j++) {
                output.append(arrayToShow[i][j]);
                if (j != arrayToShow[i].length - 1) output.append(", ");
            }
            output.append("}");
            if (i != arrayToShow.length - 1) output.append(", ");
        }
        output.append(" }");
        System.out.println(output);
    }
}