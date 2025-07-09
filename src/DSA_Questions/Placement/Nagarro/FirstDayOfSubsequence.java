package DSA_Questions.Placement.Nagarro;

public class FirstDayOfSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        int i = 0, j = 0;

        while (i < sLen && j < tLen) {
            char sCh = s.charAt(i);
            while (j < tLen) {
                char tCh = t.charAt(j);
                j++;
                if (sCh == tCh) {
                    i++;
                    break;
                }
            }
        }

        if (i == sLen)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int days=1;

        String str1="mtle";
        String str2="mettl";
//        String str1="abcxyz";
//        String str2="xyz";

        while(true) {
            if (isSubsequence(str2, str1)) {
                System.out.println("days: "+ days);
                return;
            }
            str1 += str1;
            days++;
        }
    }
}
