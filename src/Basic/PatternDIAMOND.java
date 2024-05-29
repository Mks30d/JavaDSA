public class PatternDIAMOND {
    public static void main(String[] args) {
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        // 2-1, 3-3, 4-5, 5-7
        int n = 12, m = n - 1, p = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }

        for (int i=n; i>=1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }


        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         System.out.print("  ");
        //     }
        //     m--;

        //     for (int j = 1; j <= (i - 1) + i; j++) {
        //         if (i == n - 1) {
        //             p++;
        //         }
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n-1 ; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("  ");
        //     }

        //     for (int k = 1; k <= p; k++) {
        //         System.out.print("* ");
        //     }
        //     p = p - 2;

        //     System.out.println();
        // }

    }
}
