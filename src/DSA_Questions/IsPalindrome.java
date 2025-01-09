package DSA_Questions;

public class IsPalindrome {

    public static boolean isPalindromeOptimised(String s) {

        s = s.toLowerCase();
        if (s.isEmpty()) {
            return true;
        }

        int first = 0;
        int last = s.length() - 1;

        while (first <= last) {
            char currFirstChar = s.charAt(first);
            char currLastChar = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirstChar)) {
                first++;
            } else if (!Character.isLetterOrDigit(currLastChar)) {
                last--;
            } else {
                if (currFirstChar != currLastChar) {
                    return false;
                }
                first++;
                last--;
            }

        }
        return true;
    }
//================================================================
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        String str = "";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
//            if (ch>='0' && ch<='9') {
//                return false;
//            }
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                str = str + ch;
            }
        }

        if (str.isEmpty()) {
            return true;
        }
        n = str.length();
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama"; // true
        String s2 = "race a car"; // false
        String s3 = " "; // true
        String s4 = "0P"; // false
        String s5 = "1b1"; // true

//        System.out.println(isPalindrome(s1));
//        System.out.println(isPalindrome(s2));
//        System.out.println(isPalindrome(s3));
//        System.out.println(isPalindrome(s4));
//        System.out.println(isPalindrome(s5));

        System.out.println(isPalindromeOptimised(s1));
        System.out.println(isPalindromeOptimised(s2));
        System.out.println(isPalindromeOptimised(s3));
        System.out.println(isPalindromeOptimised(s4));
        System.out.println(isPalindromeOptimised(s5));
    }
}
