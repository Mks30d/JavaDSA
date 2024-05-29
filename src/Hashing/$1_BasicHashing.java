package Hashing;

import java.util.HashMap;

public class $1_BasicHashing {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // put - O(1)----------------------------
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get - o(1)------------------------------
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Nepal"));

//      hm.getOrDefault("key", 0);
//      if "key" exist it will return its value else it will return a default value as given by user(0)

        System.out.println(hm.getOrDefault("key", -999));

        // contains - O(1)-------------------------
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Nepal"));

        //remove - O(1)----------------------------
//        hm.remove("US");  // this will return value of the key
        System.out.println(hm.remove("US"));
        System.out.println(hm.remove("USA"));
        System.out.println(hm);

        // size----------------------------
        System.out.println(hm.size());

        // isEmpty----------------------------
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
