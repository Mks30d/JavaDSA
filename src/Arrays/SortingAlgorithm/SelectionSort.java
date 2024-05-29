package Arrays.SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort_1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swapping min with ith index
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // ------------- 2nd method, TC: O(n*n)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int start = 0, end = n - i - 1;
            int maxIndex = maxIndex(arr, start, end);
            swap(arr, maxIndex, end);
        }
    }

    public static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int maxIndex, int end) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort_1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
