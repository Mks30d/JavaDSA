public class Pattern {

    // ----------hollow inverted half pyramid-------------
    public static void hollowHalfPyramid(int n) {
        System.out.println("Hollow inverted half pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n - i + 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // ------------- Inverted Full pyramid-------------
    public static void invertedFullPyramid(int n) {
        System.out.println("Inverted Full pyramid");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ----------- Inverted Hollow Full pyramid ---------------
    public static void hollowInvertedFullPyramid(int n) {
        System.out.println("Inverted Full pyramid");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                // if (i==1 || j==1 || j+i ==n+1) {
                if (i == 1 || j == 1 || j + i == n + 1) {
                    System.out.print("* ");
                    // System.out.print(j);

                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                // if (i==1 || j==1 || j+i ==n+1) {
                if (i == 1 || j == 1 || j + i == n + 1) {
                    System.out.print("* ");
                    // System.out.print(j);

                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }

    // -------- Full pyramid pattern using numbers---------
    public static void numFullPyramid(int n) {
        System.out.println("Full pyramid pattern using numbers\r\n" + //
                "");
        for (int i = 1; i <= n; i++) {

            int count = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;

            }
            count = 2 * (i - 1);
            for (int j = 2; j <= i; j++) {
                System.out.print(count);
                count--;
            }

            System.out.println();
            
        }
    }
    // Palindrome Pyramid Pattern
    
    public static void numTriangle(int n) {
        // System.out.println((char)(65));
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                // System.out.print((char)(64+j)+" ");
                System.out.print(j+" ");
            }
            int count = i-1;
            for (int j = 1; j <= i-1; j++) {
                // System.out.print((char)(64+count)+" ");
                System.out.print(count+" ");
                count--;
            }



            // for (int j = 1; j <= 2*i-1; j++) {
            // System.out.print("^");
            // if (i<=j) {
            // System.out.print("*");

            // } else {
            // System.out.print("^");

            // }
            // }

            System.out.println();
        }
    }


    // Hollow Full Pyramid
public static void hollowFullPyramid(int n){
    for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        
        for (int j = 1; j <= i; j++) {
            if (j==1|| i==n || i==j ) {
                System.out.print(j+ " ");
                
            } else {
                System.out.print( "  ");
                
            }
        }

        System.out.println();
    }
}

    // Number Rectangle
    public static void numberRectangle(int n){
        int count = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if (i==1 || i== n ||j==1 || j== n) {
                    System.out.print(count);
                }
                else{

                    // count--;
                }
            }
            
            // for (int j = 1; j <= n; j++) {
            //     if (i==1 || i== n ||j==1 || j== n) {
            //         System.out.print("*");
            //     } else {
            //         System.out.print(" ");
            //     }
            // }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // hollowHalfPyramid(6);
        // invertedFullPyramid(6);
        // hollowInvertedFullPyramid(6);
        // numFullPyramid(5);

        numTriangle(5);
        hollowFullPyramid(5);

        numberRectangle(4);
    }
}
