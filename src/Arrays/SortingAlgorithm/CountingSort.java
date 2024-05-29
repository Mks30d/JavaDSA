package Arrays.SortingAlgorithm;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 2, 2, 5 };
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
