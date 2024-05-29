package Hashing;

import java.util.HashMap;

public class SortByFrequency {

    public static void main(String[] args) {
//        String str = "aaaccc"; // aaaccc
        String str = "tree"; // eert/eetr

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) +1);
        }
        System.out.println(hm);
    }
}
