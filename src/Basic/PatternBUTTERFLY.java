public class PatternBUTTERFLY {

    public static void butterflyPattern(int n) {

            // 1st half-pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half-pattern = for 2nd half, only outer loop is changed
        for (int  i = n; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
 }

    public static void main(String[] args) {

                // BUTTERFLY pattern
        // *             * 
        // * *         * * 
        // * * *     * * * 
        // * * * * * * * * 
        
        // * * * * * * * * 
        // * * *     * * * 
        // * *         * * 
        // *             * 

        butterflyPattern(5);
        // spaces = n*2-2
        // 2-2(2*2-2), 3-4(3*2-2), 4-6(4*2-2), 5-8(5*2-2), 6-10
        // int n = 5, m = n*2-2;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // for (int k = 1; k <= m; k++) {
        // System.out.print(" ");
        // }
        // m=m-2;
        // for (int l = 1; l <= i; l++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }
        // int p=n, r=n, q = 0;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <=p; j++) {
        // System.out.print("* ");
        // }
        // p--;

        // for (int k = 1; k <= q; k++) {
        // System.out.print(" ");
        // }
        // q=q+2;

        // for (int l = 1; l <= r; l++) {
        // System.err.print("* ");
        // }
        // r--;

        // System.out.println();
        // }

    }
}
