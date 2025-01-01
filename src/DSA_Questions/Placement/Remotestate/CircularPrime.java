package DSA_Questions.Placement.Remotestate;

public class CircularPrime {

    static boolean isPrime(int n) {
// (n/2) a number cannot be divisible by any integer greater than half of its value (except for itself).
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isCircularPrime(int n) {
        int temp = n, size = 0;
        // count n size
        while (temp > 0) {
            temp = temp / 10;
            size++;
        }

        for (int i = 0; i < size; i++) {
            if (!isPrime(n)) {
                return false;
            }
            int last = n % 10;
            int rem = n / 10;
            n = (int) (last * Math.pow(10, size - 1) + rem);
        }

        return true;
    }

    static int circularPrime() {
        int count = 0;

        for (int i = 0; i < 200; i++) {
            if (isCircularPrime(i)) {
                count++;
                System.out.print(i + ", ");
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        100	2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79
//        200	2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 101, 103, 107, 113, 149, 157, 197

        System.out.println("\n"+circularPrime());
    }
}
