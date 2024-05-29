package DSA_Questions;

import java.util.Arrays;

public class RotateArray {

    static void reverseArray(int[] arr, int start, int end) {
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;

        reverseArray(nums, 0, n-1-k);
        reverseArray(nums, n-k, n-1);
        reverseArray(nums, 0, n-1);
    }

    //------------Brute force--------------
    static void rotate_1(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];

//        if(n==1) {
//            System.out.println("Error");
//            return;
//        }

        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;

        for (int i = 0; i < n; i++) {
            if (i<k) {
                arr[i] = nums[n-k+i];
            }
            else {
                arr[i] = nums[i-k];
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};
//        int k = 3;
//        int[] nums = {-1,-100,3,99};
//        int k = 2;
        int[] nums = {1,2};
        int k = 3;

        rotate(nums, k);
//        reverseArray(nums, 0, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }
}
