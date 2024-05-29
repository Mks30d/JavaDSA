package DSA_Questions;

import java.lang.reflect.Array;
import java.util.*;

public class SortColors {

    public static void sortColors(int[] nums) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            tm.put(nums[i], tm.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(tm);

        int pointer = 0;
        for (Integer key : tm.keySet()) {
            System.out.println(key);
            for (int i = 0; i < tm.get(key); i++) {
                nums[pointer] = key;
                pointer++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    //-----------using frequency array------------
    public static void sortColorsFreq(int[] nums) {
        int[] freq = new int[3];

        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(freq));

        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                System.out.println(i);
                nums[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    //------------Brute force----------
    static boolean isSorted = true;

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void sortColorsBrute(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                    isSorted = false;
                }
            }
            if (isSorted) {
//                System.out.println("Is sorted");
                return;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
//        int[] nums = {2,0,1};
        int[] nums = {2, 0, 2, 1, 1, 0};
//        int[] nums = {0, 0, 1, 1, 2, 2};
        sortColorsFreq(nums);
    }
}
