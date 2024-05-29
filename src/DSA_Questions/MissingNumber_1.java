package DSA_Questions;

import java.util.Arrays;

public class MissingNumber_1 {

    static void sort(int[] nums) {
        int n= nums.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i]>nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static int missingNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]){
                System.out.println(i);
                return i;
            }
//            System.out.println(i+", "+nums[i]);
        }
//            System.out.println(nums.length);
        return nums.length;
    }

    public static void main(String[] args)  {
//        int[] nums = {0,1};
//        int[] nums = {3,0,1};
        int[] nums = {9,6,4,2,3,5,7,0,1};
        missingNumber(nums);
    }
}
