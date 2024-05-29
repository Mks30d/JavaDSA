package Arrays.BinarySearchQues;

public class SqrtOfNum {

    public static int sqrtOfNum(int num) {
        long start = 1, end = num;
        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid*mid;
            if (square  <= num) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) ans;
    }

    // ------------ brute force ----------------
    public static int sqrtOfNum_1(int num) {

        int ans = 0;
        for (int i = 0; i <= num; i++) {
            if ((i * i) <= num) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 999999999;
        System.out.println(sqrtOfNum_1(num));
        System.out.println(sqrtOfNum(num));
    }
}
