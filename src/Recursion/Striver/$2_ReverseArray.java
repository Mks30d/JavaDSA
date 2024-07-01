package Recursion.Striver;

import java.util.Arrays;

public class $2_ReverseArray {

    static void reverseArray2(int[] arr, int i) {
        int n = arr.length-1;
        if (i>=n-i) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i];
        arr[n-i] = temp;

        reverseArray2(arr, i+1);
    }

    static void reverseArray1(int[] arr, int left, int right) {
        if (left>=right) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray1(arr, left+1, right-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray2(arr, 0);
    }
}
