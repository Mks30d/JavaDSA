package DSA_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class SearchRange {
    public static int[] searchRangeHashMap(int[] nums, int target) {
        int n = nums.length;
        int[] index = {-1, -1};
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (hm.containsKey(nums[i])) {
                    index[1] = i;
                } else {
                    index[0] = i;
                    index[1] = i;
                    hm.put(nums[i], i);
                }
            }
        }
        return index;
    }

    public static int[] searchRangeLoop(int[] nums, int target) {
        int[] index = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (index[0] == -1) {
                    index[0] = i;
                }
                index[1] = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 8, 10};
//        int target = 8;
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        int target = 6;
//        int[] nums = {3,3,3};
//        int target = 3;
//        int[] nums = {};
//        int target = 3;
        int[] nums = {3};
        int target = 3;
//        int[] nums = {1, 3};
//        int target = 3;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(searchRangeHashMap(nums, target)));
        System.out.println(Arrays.toString(searchRangeLoop(nums, target)));
    }
}
