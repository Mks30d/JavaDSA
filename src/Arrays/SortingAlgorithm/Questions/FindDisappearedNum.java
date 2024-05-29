package Arrays.SortingAlgorithm.Questions;

import java.util.*;

public class FindDisappearedNum {

    public static int[] findDisappearedNum(int arr[]) {

        // cyclic sort
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else { 
                i++;
            }
        }
        System.out.println(Arrays.toString(arr)); // printing sorted array

        // just find missing numbers
        int[] newArr = new int[arr.length - 1];
        int k = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                newArr[k] = j + 1; // adding missing num into newArr
                k++;
            }
        }
        return newArr;
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 6, 8 };
        // int[] arr = { 1,1,1,1,1,1,1 };

        // System.out.println(findDisappearedNum(arr));

        // int[] newArr=  findDisappearedNum(arr);
        // System.out.println(Arrays.toString(newArr)); // OR
        System.out.println(Arrays.toString(findDisappearedNum(arr)));

    }
}
