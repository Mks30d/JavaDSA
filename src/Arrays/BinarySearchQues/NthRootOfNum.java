package Arrays.BinarySearchQues;
// BS-11. Find the Nth root of an Integer

public class NthRootOfNum {

    public static int findRoot(int n, int m) {

        int start = 1, end = m;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) > m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // ------------- Brute Force ----------------------
    public static int findRoot_1(int n, int m) {
        for (int i = 1; i <= m; i++) {
            if (Math.pow(i, n) == m) {
                return i;
            } else if (Math.pow(i, n) > m) {
                break;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        // n = 4;
        // m = 69;
        System.out.println(findRoot(n, m));
    }
}
