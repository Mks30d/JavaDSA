package DSA_Questions;
import java.util.*;

public class IsAnagram {

    //---------------Method 3 using hashmap-------------------

    //---------------Method 2-------------------
    public static boolean isAnagramSort(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
    //---------------Method 1-------------------
    public static boolean isAnagram(String s, String t) {
        int sleng = s.length();
        int tleng = t.length();
        boolean isPresent = false;
        if (sleng != tleng) {
            return false;
        }
        for (int i = 0; i < sleng; i++) {
            for (int j = 0; j < tleng; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    t = t.substring(0, j) + "#" + t.substring(j, tleng);
                    isPresent = true;
                    break;
                } else {
                    isPresent = false;
                }
            }
            if (!isPresent) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram";
        String s = "rat", t = "rat";
        System.out.println(isAnagram(s, t));

        System.out.println(isAnagramSort(s,t));
    }
}
