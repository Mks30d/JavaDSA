package DSA_Questions;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum2(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int num1=0, num2=0;
        int firstIndex = -1, secondIndex = -1;
        int copyArr[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                num1 = nums[start];
                num2 = nums[end];
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1)
                firstIndex = i;
            if (nums[i] == num2)
                secondIndex = i;
        }

        return new int[] { firstIndex, secondIndex };
    }
    public static int[] twoSum(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int nums1, nums2;
        int firstIndex = -1, secondIndex = -1;
        int copyArr[] = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(copyArr));
        System.out.println(Arrays.toString(nums));

        int num1=0, num2=0;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                num1 = nums[start];
                num2 = nums[end];
                System.out.println(num1 +", " + num2);
//                return;
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (copyArr[i] == num1)
                firstIndex = i;
            if (copyArr[i] == num2)
                secondIndex = i;
        }
        System.out.println(firstIndex + ", " + secondIndex);

//        System.out.println(Arrays.toString(new int[] {firstIndex, secondIndex}));
        return new int[] { firstIndex, secondIndex };
    }


    public static void twoSum1(int[] nums, int target) {
        int arr[] = nums;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
        int[] nums = {3,4,2};
        int target = 6;
//        twoSum(nums, target);
        int[] nums1 = twoSum2(nums, target);

        System.out.println(Arrays.toString(nums1));
    }
}
