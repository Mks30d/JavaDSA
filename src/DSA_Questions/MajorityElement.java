package DSA_Questions;
import java.util.*;

public class MajorityElement {



//--------Optimal Approach: Moore’s Voting Algorithm:---------
    static int isMajorityElement(int[] nums, int element) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (element == nums[i])
                count++;

            if (count > nums.length/2)
                return element;
        }
        return -1;
    }


    static int findMajorityElement(int[] nums) {
        int element = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (element == nums[i])
                count++;
            else
                count--;

            if (count == 0){
                element = nums[i];
                count = 1;
            }
//            System.out.println(element);
        }

//        // checking if the element is in majority or not
//        return  isMajorityElement(nums, element);

        // if we know there must exist majority element then we need not to call isMajorityElement(), simply return element
        return  element;
    }

//----------------------Brute force------------------
// Method 1: by sorting, as majority element exists it must occur in the middle as no. of count is >n/2 then simply return middle element
// Method 2 (O(n*n)):

    static int majorityElement_1(int[] nums) {

        int n=nums.length;
        for (int i=0; i<n; i++) {
            int k=0;
            for (int j=0; j<n; j++) {
                if (nums[i]==nums[j]) {
                    k++;
//                    System.out.println(k);
                }
            }
            if(k > n/2) {
//                System.out.println(k);
                return nums[i];
            }
        }
        return -1;
    }
// by taking every element one by one and counting no. of times they appeared in the array


    public static void main(String[] args) {
        System.out.println("Hello, World!");

         int[] nums = {3,2,3};
//         int[] nums = {2,2,1,1,1,1,2,2};
//        int[] nums = {8,8,7,7,7};
        System.out.println(findMajorityElement(nums));
    }
}
