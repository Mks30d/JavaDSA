package DSA_Questions.Placement.Webkul;

//n=3;
//ee
// *       *
// *   *   *
// *eee*eee*
// *   *   *
// *       *
//         ee

//Ex.1 for n=3
//ee
// *       *
// *   *   *
// *eee*eee*
// *   *   *
// *       *
//         ee

//Ex.2 for n=5
//eeee
//   *           *
//   *     *     *
//   *     *     *
//   *eeeee*eeeee*
//   *     *     *
//   *     *     *
//   *           *
//               eeee

public class Pattern {
//-------------------Method 1----------------------
    public static void pattern(int n) {
//        int n = 5;

        for (int i = 0; i < n - 1; i++) {
            System.out.print("e");
        }
        System.out.println();

        for (int i = 0; i < (n + 2) / 2; i++) {
            for (int j = 0; j < 3 * n + 1; j++) {
                if (j == n - 2 || (j == n * 2 - 1 && i > 0) || j == 3 * n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int j = 0; j < 3 * n + 1; j++) {
            if (j == n - 2 || j == 2 * n - 1 || j == 3 * n) {
                System.out.print("*");
            } else if (j < n - 2) {
                System.out.print(" ");
            } else {
                System.out.print("e");
            }
        }
        System.out.println();

        for (int i = 0; i < (n + 2) / 2; i++) {
            for (int j = 0; j < 3 * n + 1; j++) {
                if (j == n - 2 || (j == n * 2 - 1 && i < (n + 2) / 2 - 1) || j == 3 * n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 4 * n - 1; i++) {
            if (i < 3 * n) {
                System.out.print(" ");
            } else {
                System.out.print("e");
            }
        }
    }

//-------------------Method 2----------------------

    public static void pattern1(int n) {
        int width = 3 * n + 1; // Total width of the pattern

        // Top 'e' line
        printRepeatedChar('e', n - 1);
        System.out.println();

        // Upper section
        for (int i = 0; i < (n + 2) / 2; i++) {
            for (int j = 0; j < width; j++) {
                if (j == n - 2 || j == 2 * n - 1 && i > 0 || j == 3 * n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Middle line
        for (int j = 0; j < width; j++) {
            if (j == n - 2 || j == 2 * n - 1 || j == 3 * n) {
                System.out.print("*");
            } else if (j >= n - 2 && j < 3 * n) {
                System.out.print("e");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Lower section
        for (int i = 0; i < (n + 2) / 2; i++) {
            for (int j = 0; j < width; j++) {
                if (j == n - 2 || j == 2 * n - 1 && i < (n + 2) / 2 - 1 || j == 3 * n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Bottom 'e' line
        printRepeatedChar(' ', 3 * n);
        printRepeatedChar('e', n-1);
        System.out.println();
    }

    // Helper function to print a character multiple times
    private static void printRepeatedChar(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {

        System.out.println("Ex.1 for n=3");
        pattern(3);
        System.out.println("\n");
        System.out.println("Ex.2 for n=5");
        pattern(5);
    }

}
