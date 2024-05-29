
public class PatternTriangle {
    public static void main(String[] args) {

        int n = 10;

        // INVERTED & ROTATED HALF-PYRAMID pattern
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        System.out.println("\nINVERTED & ROTATED HALF-PYRAMID pattern\n");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // INVERTED HALF-PYRAMID with Numbers pattern
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        System.out.println("\nINVERTED HALF-PYRAMID with Numbers pattern\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

        // FLOYD'S Triangle pattern
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        System.out.println("\nFLOYD'S Triangle pattern\n");
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        // 0-1 Triangle pattern
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        System.out.println("\n0-1 Triangle pattern\n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if ( (i+j) %2 ==0 ) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                    
                }   // OR
                // if (i % 2 == 0) {
                //     if (j % 2 == 0) {
                //         System.out.print("1 ");
                //     } else {
                //         System.out.print("0 ");
                //     }
                // } else {
                //     if (j % 2 == 0) {
                //         System.out.print("0 ");
                //     } else {
                //         System.out.print("1 ");
                //     }
                // }
            }
            System.out.println();
        }
    }
}
