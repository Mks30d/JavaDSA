package Arrays.SortingAlgorithm.Questions;

import java.util.Arrays;

public class FindErrorNums {

    public static int[] findErrorNums(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        int[] result = new int[2];
        for (int j = 0; j < arr.length; j++) {
             if (arr[j] != j+1) {
                result[0] = arr[j]; // duplicate number
                result[1] = j+1; // missing number

                return new int[] {arr[j], j+1};
             }
        }
        // return result;
        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
