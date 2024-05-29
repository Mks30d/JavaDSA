package Arrays.SortingAlgorithm.Questions;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] arr) {
        int i = 0;

        // cyclic sort: first sorting the array
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } 
            // else if (arr[i] == arr.length) {
            //     i++;
            // }   //OR just else statement
            else {
                i++;
            }
        }

        // case-1, search for first missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        // case-2
        return arr.length;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        // int[] arr = { 0, 1 };
        // int[] arr = { 5, 4, 3, 2, 1, 6, 8, 0 };
        // System.out.println(arr.length);
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(missingNumber(arr));
    }
}
