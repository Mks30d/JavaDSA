public class PatternPYRAMID {
    public static void main(String[] args) {

        int n = 5, m = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // PALINDROMIC Pattern with Numbers pattern
        System.out.println("\nPALINDROMIC Pattern with Numbers pattern\n");
        m = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            for (int k = 2; k < i; k++) {
                System.out.print(k + " ");
            }

            // int= p=i;
            // for (int k = 1; k <= i; k++) {
            // System.out.print(p+" ");
            // p--;
            // }

            // for (int k = 1; k < i; k++) {
            // System.out.print((k+1) +" ");
            // }

            System.out.println();
        }

    }
}
