public class PatternStar {
    public static void main(String[] args) {
        int n = 5;

        patter1(n);
        patter11(n);

        // ------------ method 1-----------
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                // for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            // k--;
            System.out.println();
        }
    }

    // ------------ method 2-----------
    public static void patter1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ------------ method 3-----------
    public static void patter11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
