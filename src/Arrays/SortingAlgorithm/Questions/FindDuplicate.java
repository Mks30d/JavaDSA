package Arrays.SortingAlgorithm.Questions;

import java.util.Arrays;

public class FindDuplicate {

    public static int findDuplicate(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    // Second method - Brute Force
    public static int findDuplicate_1(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1) {
                return arr[j];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 2, 2, 1, 5, 4 };
        int[] arr = { 3, 2, 1, 2, 4 };
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate_1(arr));
    }
}
