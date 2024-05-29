package DSA_Questions;

import java.util.Arrays;

public class RemoveDuplicates {

        static int removeDuplicates(int[] nums) {
        int k=1;
        int arr[] = new int[nums.length];
        arr[0] = nums[0];

        for (int i=1; i< nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                k++;
                arr[k-1] = nums[i];
//                nums[k-1] = nums[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2};
//        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}


//int[] nums = [...]; // Input array
//int[] expectedNums = [...]; // The expected answer with correct length
//
//int k = removeDuplicates(nums); // Calls your implementation
//
//assert k == expectedNums.length;
//for (int i = 0; i < k; i++) {
//        assert nums[i] == expectedNums[i];
//}