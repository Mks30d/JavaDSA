package DSA_Questions.Placement.Remotestate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramArray {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();

// first putting s every char to hashmap
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
// checking every char of t in the map, if present decrementing the value by 1
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
            } else {
                return false;
            }
// If the frequency of a char becomes zero, remove it from the map
// (when value becomes 0 it doesn't mean hashmap becomes empty)
            if (hm.get(ch) == 0) {
                hm.remove(ch);
            }
        }

        return hm.isEmpty();
    }

    public static boolean isAnagram1(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    public static ArrayList<String> anagram(String str, String[] arr) {
        ArrayList<String> anagramList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(isAnagram(str, arr[i]));
            if ( isAnagram(str, arr[i]) ) {
                anagramList.add(arr[i]);
            }
        }

        return anagramList;
    }

    public static void main(String[] args) {
        String str = "horse";
        String[] arr = {"sehor", "cat", "shore", "dog", "animal", "horse"};

        ArrayList<String> list = anagram(str, arr);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
