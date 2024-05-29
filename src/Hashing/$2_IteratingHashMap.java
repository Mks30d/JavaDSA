package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class $2_IteratingHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("US", 80);
        hm.put("China", 150);
        hm.put("Nepal", 20);
        hm.put("SL", 20);
        System.out.println(hm);

        //Iterate
        Set<String> keys = hm.keySet(); // this will give list of keys
        System.out.println(keys);

        for(String k: keys) {
//        for(String k: hm.keySet()) {
            System.out.println(k +"->"+ hm.get(k));
        }

        System.out.println(hm.entrySet());

//        for (Map.Entry<String, Integer> e : map.entrySet()){
//        }


        //-------for each loop
        int[] arr ={1,2,3,4};
        for (int val : arr){
            System.out.println(val);
        }

    }
}
