package Arrays.BinarySearchQues;

public class KokoEatingBananas {

    public static int eatingBananas(int[] arr, int hrs) {

        int start = 1, end = maxNum(arr);
        int ans=0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (totalTime(arr, mid)<= hrs) {
                ans = mid;
                end = mid -1;
            } else {
                start = mid +1;
            }
        }

        return ans;
    }

    public static int totalTime(int[] arr, int hourly) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + (int) Math.ceil((float) arr[i] / hourly);
            // System.out.println((Math.ceil((float)arr[i] / hourly)));
        }
        return total;
    }

    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // ----------- Brute Force: TC - O(max(arr) * n ) -----------------
    public static int eatingBananas_1(int[] arr, int hrs) {

        for (int i = 1; i <= maxNum(arr); i++) {
            int reqTime = totalTime(arr, i);
            if (reqTime <= hrs) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        // int[] arr = { 1, 3, 7, 11 };
        int hrs = 8;

        System.out.println(totalTime(arr, 2));
        System.out.println(eatingBananas(arr, hrs));
        System.out.println(eatingBananas_1(arr, hrs));

        // System.out.println(Math.ceil((float) (5 / 2)));
        // int a = 5;
        // int b = 3;
        // int c = (int) (a / b); // c = 1
        // int d = (int) (Math.ceil(a / b)); // (a/b)=1.666, its ceil will be 2
        // System.out.println(c); // prints 1
        // System.out.println(d); // prints 2
    }
}
