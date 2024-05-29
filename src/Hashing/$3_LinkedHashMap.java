package Hashing;

import java.util.LinkedHashMap;
import java.util.HashMap;

public class $3_LinkedHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("IN", 100);
        hm.put("CH", 150);
        hm.put("US", 80);
        hm.put("NP", 5);
        System.out.println(hm);

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("IN", 100);
        lhm.put("CH", 150);
        lhm.put("US", 80);
        lhm.put("NP", 5);
        System.out.println(lhm);
    }
}
