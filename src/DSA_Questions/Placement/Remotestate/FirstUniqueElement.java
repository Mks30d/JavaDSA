package DSA_Questions.Placement.Remotestate;

import java.util.HashMap;

public class FirstUniqueElement {

    public static int firstUniqueElement(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {4, 5, 1, 2, 5, 4, 3, 2};
//        int[] arr = {4, 5, 1, 1, 2, 5, 4, 3, 2};
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};
        System.out.println(firstUniqueElement(arr));
    }
}
