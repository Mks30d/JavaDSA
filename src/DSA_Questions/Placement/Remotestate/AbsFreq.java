package DSA_Questions.Placement.Remotestate;

import java.util.HashMap;
//Absolute distinct count in a sorted array
// geeksforgeeks.org/absolute-distinct-count-array-sorted-absolute-values/
public class AbsFreq {

    public static int absFreq(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = Math.abs(arr[i]);
            if (!hm.containsKey(value)) {
                hm.put(value, 1);
            }
        }

        return hm.size();
    }

    public static void main(String[] args) {
//        int[] arr = {-5, -4, -2, 0, 2,5}; //4 unique abs number
//        int[] arr = {-3, -2, 0, 3, 4, 5}; // 5
        int[] arr = {-1, -1, -1, -1, 0, 1, 1, 1, 1}; // 2
//        int[] arr = {0, 0, 0}; // 0
//        int[] arr = {-1, -1, -1, -1, 0}; // 2
        System.out.println(absFreq(arr));
    }
}
