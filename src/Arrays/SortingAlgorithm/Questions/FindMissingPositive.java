package Arrays.SortingAlgorithm.Questions;

import java.util.Arrays;

public class FindMissingPositive {

    public static int findMissingPositive(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if ((arr[i] > 0 && arr[i] <= arr.length) && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }

        return arr.length + 1;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        // int[] arr ={7,8,9,11,12};

        System.out.println(findMissingPositive(arr));
    }
}
