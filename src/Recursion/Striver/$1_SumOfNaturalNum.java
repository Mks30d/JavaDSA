package Recursion.Striver;

public class $1_SumOfNaturalNum {

//    Parameterised Recursion
    static void sumOfNaturalNum(int sum, int n) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNaturalNum(sum + n, n = n - 1);
    }

//    Functional Recursion
    static int sumOfNaturalNumFun(int n){
        if (n<1) {
            return 0;
        }
        return n + sumOfNaturalNumFun(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        sumOfNaturalNum(0, n);

        System.out.println(sumOfNaturalNumFun(n));
    }
}
