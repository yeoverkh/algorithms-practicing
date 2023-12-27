package Exercises;

import java.util.Arrays;

public class MergeSortTwoSortedArrays {

    public static void main(String[] args) {
        int[] first = {1, 2, 3, 5, 10, 11, 12};
        int[] second = {2, 4, 6, 8, 9, 12}; // 1, 2, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 12

        int[] merged = mergeArrays(first, second);

        System.out.println(Arrays.toString(merged));
    }

    private static int[] mergeArrays(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int firstIndex = 0, secondIndex = 0;
        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                merged[firstIndex + secondIndex] = first[firstIndex++];
            } else {
                merged[firstIndex + secondIndex] = second[secondIndex++];
            }
        }
        if (firstIndex == first.length) {
            firstIndex--;
            for (int index = secondIndex; index < second.length; index++) {
                merged[firstIndex + index] = second[index];
            }
        } else {
            for (int index = firstIndex; index < first.length; index++) {
                merged[index + secondIndex] = first[index];
            }
        }
        return merged;
    }
}
