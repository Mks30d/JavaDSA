public class BinomialCoefficent {
    // nCr = n! / ( (r!) (n-r)! )

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        // int result =1;
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int result = n_fact / (r_fact * nmr_fact);
        return result;
    }

    public static void main(String[] args) {

        int n = 5, r = 2;
        System.out.println("Result : "+binCoeff(n, r));
    }
}
