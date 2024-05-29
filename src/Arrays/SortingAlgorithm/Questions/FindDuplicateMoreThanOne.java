package Arrays.SortingAlgorithm.Questions;

import java.util.Arrays;

public class FindDuplicateMoreThanOne {

    public static int[] findDuplicate(int[] arr) {

        int i = 0, k = 0;
        while (i < arr.length) {

            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] count = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                count[k] = arr[j];
                k++;
            }
        }

        return count;
    }

    public static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 1, 2, 4, 3 };
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(Arrays.toString(findDuplicate(arr)));
    }
}
