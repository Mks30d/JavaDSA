//package DSA_Questions;
//
//import java.util.HashMap;
//
//public enum FrequencySort {
//    public static String frequencySort(String s) {
//        int n = s.length();
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            hm.put(ch, hm.getOrDefault(hm.get(ch), 0) + 1);
//        }
//
//        String ans = ""+s.charAt(0);
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (hm.get(s.charAt(i)) > hm.get(ans.charAt(j))) {
//                    ans = ans.substring(0, j) + s.charAt(i) + ans.substring(j);
//                    break;
//                }
//            }
//        }
//
//        return ans;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
