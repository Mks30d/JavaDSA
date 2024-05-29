package Arrays.SortingAlgorithm;

import java.util.Arrays;

public class CycleSort {
    public static void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            // correctIndex = value -1;
            int correctIndex = arr[i] - 1;

            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 1 };
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
