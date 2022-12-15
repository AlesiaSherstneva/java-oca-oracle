package lesson18;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] array = {1, 6, -4, 0, 456, -17, 74, 2};
        System.out.println(Arrays.toString(sorting(array)));
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
}
