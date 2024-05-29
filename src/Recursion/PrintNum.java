public class PrintNum {
    static void printNum(int n) {
        if (n==1) {
            System.out.println(n);
            return;  // if return is not here then it will trap into infinity loop
        }
        System.out.println(n);
        printNum(n-1);
    }

    static void printNumIncreasing(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        printNumIncreasing(n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
//        printNum(5);
        printNumIncreasing(5);
    }

}
