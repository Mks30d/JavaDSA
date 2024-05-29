package Arrays.BinarySearchQues;

// BS-14. Find the Smallest Divisor Given a Threshold | Binary Search
public class SmallestDivisor {

    // ----------------- TC: O( log(max) * N )
    public static int smallestDivisor(int[] arr, int threshold) {
        int start = 1, end = maxElement(arr);
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = divisorSum(arr, mid);

            if (sum <= threshold) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int divisorSum(int[] arr, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) arr[i] / mid);
        }
        return sum;
    }

    public static int maxElement(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // ----------------Brute force, TC: O(max * N)
    public static int smallestDivisor_1(int[] arr, int threshold) {

        int max = maxElement(arr);
        for (int i = 1; i < max; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += (int) Math.ceil((double) arr[j] / i);
            }
            if (sum <= threshold) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9 };
        int threshold = 6;

        System.out.println(smallestDivisor(arr, threshold));
        System.out.println(smallestDivisor_1(arr, threshold));
    }
}
