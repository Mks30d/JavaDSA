package DSA_Questions;

import java.util.Arrays;

public class MoveZeroes {

    static void moveZeroes(int[] nums) {
        int k =0;
        if (nums[0] != 0){

        }
//        if (nums.length==1 && nums[0] != 0){
//            return;
//        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
//                nums[k] = nums[i];
//                nums[i] = 0;
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }

//        System.out.println(Arrays.toString(nums));
    }


//    ------------Brute force--------------
    static void moveZeroes_1(int[] nums) {
        int[] arr= new int[nums.length];
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,12};
//        int[] nums = {0};
//        int[] nums = {1};
        int[] nums = {1,0};
        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
