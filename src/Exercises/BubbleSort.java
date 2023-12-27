package Exercises;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] test = {1, 5, 3, 10, 100, 14, 15, 3}; // after sorting must be 1, 3, 3, 5, 10, 14, 15, 100.

        bubbleSort(test);

        System.out.println(Arrays.toString(test));
    }

    private static void bubbleSort(int[] sorting) {
        for (int i = 0; i < sorting.length; i++) {
            for (int j = i + 1; j < sorting.length; j++) {
                if (sorting[i] > sorting[j]) {
                    int temp = sorting[i];
                    sorting[i] = sorting[j];
                    sorting[j] = temp;
                }
            }
        }
    }
}
