package Hashing;

import java.util.HashMap;

// Valid Anagram are:
// s= "abc" , t="cab" are valid anagram
// length of word are same of two string
// no. of unique letter are same in two string

public class ValidAnagram {

    static void validAnagram(String s, String t){

        if (s.length() != t.length()) {
            System.out.println("Not a valid Anagram");
            return;
        }

        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
//            if (hm.containsKey(ch)){
//                int count = hm.get(ch);
//                hm.put(ch, count+1);
//            } else {
//                hm.put(ch, 1);
//            }
            hm.put(ch, hm.getOrDefault(ch, 0) +1);
        }
        System.out.println(hm);

        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            if (!hm.containsKey(ch)) {
                System.out.println("Not a valid Anagram");
                return;
            }
        }
        System.out.println("valid Anagram");
    }

    public static void main(String[] args) {
//        String s= "race", t = "care";
        String s= "race", t = "cart";
        validAnagram(s,t);
    }
}
