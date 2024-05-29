package Arrays.SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
    }

    // ------------- 2nd method
    public static void insertionSort_1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1,6,1 };
        insertionSort_1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
