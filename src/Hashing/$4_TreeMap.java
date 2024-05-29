
package Hashing;

import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;

public class $4_TreeMap {

    public static void main(String[] args) {

        //HashMap are unordered
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("IN", 100);
        hm.put("CH", 150);
        hm.put("US", 80);
        hm.put("NP", 5);
        System.out.println("HashMap      : "+hm);

        // LinkedHashMap are ordered as inputted
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("IN", 100);
        lhm.put("CH", 150);
        lhm.put("US", 80);
        lhm.put("NP", 5);
        System.out.println("LinkedHashMap: "+ lhm);

        // TreeMap are alphabetical order
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("IN", 100);
        tm.put("CH", 150);
        tm.put("US", 80);
        tm.put("NP", 5);
        System.out.println("TreeMap        " +tm);

    }
}

