public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n==0) {
            return  0;
        }
        return n%10 + sumOfDigits(n/10);
    }

    public static int productOfDigits(int n ) {
        if (n%10==n){
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }

    public static void main(String[] args) {
        int n = 12346;
        int n1 = 142;
        System.out.println("Sum: "+sumOfDigits(n));
        System.out.println("Product: "+productOfDigits(n1));

    }
}
