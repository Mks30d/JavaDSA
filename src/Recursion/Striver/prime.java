package Recursion.Striver;

public class prime {

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //  29
    static void findPrime(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                int temp = i, sum = 0;
                while (temp != 0) {
                    int rem = temp % 10;
                    temp = temp / 10;
                    sum = sum + rem;
                }
                if (isPrime(sum)){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        findPrime(20, 50);
    }
}
