public class Reverse {
    public static int helperFunc(int n) {
        int i=0;
        while (n != 0) {
            i++;
            n=n/10;
        }
        return i;
    }
    public static int reverse(int n) {

        if (n%10 == n) {
            return n;
        }
        return n%10 * (int)Math.pow(10, helperFunc(n)-1) + reverse(n/10);
    }

    static boolean palindrome(int n) {
        return n==reverse(n);
    }

    public static void main(String[] args) {
        int n=12321;
        System.out.println(reverse(n));
        System.out.println(palindrome(n));


    }
}
