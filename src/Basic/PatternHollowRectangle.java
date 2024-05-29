// HOLLOW RECTANGLE pattern

public class PatternHollowRectangle {
    public static void main(String[] args) {
        int n = 10, m = 6;

        patter(3);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

//========================================================
    public static void patter(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(Math.min(i - 1, j - 1) + " ");

            }
            for (int j = 1; j <= n; j++) {
                System.out.print(Math.min(i - 1, n - j) + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(Math.min(n-i, j-1)+" ");
            }

            // for (int j = 1; j <= n; j++) {
            //     System.out.print(Math.min(i+1, j+1)+" ");
            // }

            System.out.println();
        }
    }
}
