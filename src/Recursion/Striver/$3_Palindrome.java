package Recursion.Striver;

public class $3_Palindrome {

    static boolean palindrome(String str, int i, int n){

        if (i>=n-i) {
            return true;
        }
        if (str.charAt(i)!=str.charAt(n-i)) {
            return false;
        }
        return palindrome(str, i+1, str.length()-1);
    }

    public static void main(String[] args) {
        String str = "tenet";

        System.out.println(palindrome(str, 0, str.length()-1));

    }
}
