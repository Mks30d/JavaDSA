package DSA_Questions;

import java.util.HashMap;

public class minStringWindow {
    // 76. Minimum Window Substring
    public static String minWindow(String s, String t) {
        String result = "";
        int l = 0, r = 0, minSize = Integer.MAX_VALUE, n = s.length(), m = t.length();

        if (n < m)
            return "";

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < m; j++) {
                char ch = t.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 0)
                        map.remove(ch);
                    if (map.isEmpty() && minSize > (j-i+1)) {
                        l = i;
                        minSize = Math.min(minSize, j - i + 1);
                        break;
                    }
                }
            }
        }

        if (minSize != Integer.MAX_VALUE) {
            for (int i = l; i < l+minSize; i++) {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        String s = "ADOBECODEBANC";
//        String s = "CODEBANC";
//        String t = "ABC"; // "BANC"
        String s = "cwaefgcf";
        String t = "cae"; // ""cwae""

        System.out.println("Result: "+minWindow(s, t));
    }
}
