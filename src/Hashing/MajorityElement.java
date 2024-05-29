package Hashing;

import java.util.HashMap;
import java.util.Queue;
import java.util.Set;

public class MajorityElement {

    public static void majorityElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];

            if (hm.containsKey(ele)) {
                int count = hm.get(ele) + 1;
                hm.put(ele, count);
            } else {
                hm.put(ele, 1);
            }

            // the above code from 16-21 is reduced to:
//            hm.put(ele, (hm.getOrDefault(ele, 0) +1) );

//            hm.getOrDefault("key", 0);
//            if "key" exist it will return its value else it will return a default value as given by user(0)
        }

        System.out.println(hm);

        // Iterate HashMap
        Set<Integer> keys = hm.keySet(); // this will give list of keys
//        System.out.println(keys);

        for (int k : keys) {  //OR
//            System.out.println(hm.get(k));
            int count = hm.get(k);
            if (count > n / 3) {
                System.out.println("MajorityElement: " + k);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//        int[] arr = {1,2};
        majorityElement(arr);
    }
}
