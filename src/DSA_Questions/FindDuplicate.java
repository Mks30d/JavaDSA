package DSA_Questions;

import java.util.HashMap;

public class FindDuplicate {

    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hm.isEmpty()) {
                hm.put(nums[i], 1);
            } else {
                int value = hm.getOrDefault(nums[i], 0);
                hm.put(nums[i], value + 1);
            }
        }

        System.out.println(hm.keySet());
        for (int key : hm.keySet()) {
            if (hm.get(key) > 1) {
                System.out.println(key);
                return key;
            }
        }

        System.out.println(hm);
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 3, 4, 2, 2};
        int[] nums = {3,3,3,3,3};
        findDuplicate(nums);
    }
}
