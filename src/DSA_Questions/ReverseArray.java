package DSA_Questions;

import java.util.Arrays;

public class ReverseArray {

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, 0, arr.length-3);
        System.out.println(Arrays.toString(arr));
    }
}
