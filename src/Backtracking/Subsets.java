package Backtracking;

public class Subsets {

    static void subsets(String str, String ans, int i) {

        if (i == str.length()) {
            if (ans.isEmpty())
                System.out.println("null");
            else
                System.out.println(ans);
            return;
        }
        // "Yes" choice
        subsets(str, ans + str.charAt(i), i + 1);
        // "No" choice
        subsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }
}
