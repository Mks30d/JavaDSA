public class PatternRhombus {
    public static void main(String[] args) {

        // SOLID RHOMBUS pattern
        System.out.println("\n SOLID RHOMBUS pattern");
        int n = 5, m = n - 1;
        for (int i = 1; i <= n; i++) {

            // for (int j = 1; j <= m; j++) {
            //     System.out.print("  ");
            // }
            // m--;

            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // HOLLOW RHOMBUS pattern
        System.out.println("\nHOLLOW RHOMBUS pattern");
        m = n-1;
        for (int i = 1; i <= n; i++) {

            // for (int j = 1; j <= m; j++) {
            //     System.out.print("  ");
            // }
            // m--;
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                if (i == 1 || i == n || k == 1 || k == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
