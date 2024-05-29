public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));

//        int n =40;
//        System.out.println((int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5)));
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fiboFormula(int n) {
//       return long instead of int b/c of size of int
        // return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    public static int fibonacci(int n) {
//      base condition
        if (n < 2) {
//            System.out.println(n);
            return n;
        }

        // when we have last statement in the function call, then it is called tail recursion
        // this is not a tail recursion
        int ans = fibonacci(n - 1) + fibonacci(n - 2);
//        System.out.println(ans);
        return ans;
    }
}
