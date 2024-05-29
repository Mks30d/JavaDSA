package DSA_Questions;

import java.util.Arrays;

public class RearrangeArray {

    public static int[] rearrangeArrayOptimal(int[] nums) {
        int n = nums.length, posIndex = 0, negIndex = 1;
        int[] newNums = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                newNums[negIndex] = nums[i];
                negIndex = negIndex + 2;
            } else {
                newNums[posIndex] = nums[i];
                posIndex = posIndex + 2;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(newNums));
        return newNums;
    }

    public static int[] rearrangeArrayBrute(int[] nums) {
        int n = nums.length, pos = 0, neg = 0;
        int[] copyNums = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                copyNums[n / 2 + neg] = nums[i];
                neg++;
            } else {
                copyNums[pos] = nums[i];
                pos++;
            }
        }
        System.out.println(Arrays.toString(copyNums));

        for (int i = 0; i < n / 2; i++) {
            nums[i * 2] = copyNums[i];
            nums[i * 2 + 1] = copyNums[n / 2 + i];
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
//        int[] nums = {-1,1};

        rearrangeArrayOptimal(nums);
    }
}
