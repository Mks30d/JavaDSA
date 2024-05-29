package DSA_Questions;

public class KadanesAlgorithm_SubArrays {

    // -------------Kadaens Algroithm for Positive Numbers--------------
    public static void kadanesAlgorithm(int arr[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cursum = cursum + arr[i];

            if (cursum < 0) {
                cursum = 0;
            }

            maxsum = Math.max(maxsum, cursum);
        }
        System.out.println(maxsum);
    }

    // ------------Kadaens Algroithm for +ve & -ve numbers-------------
    public static void kadanesAlgorithmNegative(int arr[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE, neg_maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cursum = cursum + arr[i];

            if (cursum < 0) {
                cursum = 0;
            }

            maxsum = Math.max(maxsum, cursum);
            neg_maxsum = Math.max(neg_maxsum, arr[i]);
        }
        if (maxsum == 0) {
            maxsum = neg_maxsum;
        }
        // if (maxsum == 0) {
        //      System.out.println(neg_maxsum);
        // } else {
                System.out.println(maxsum);
        // }
    }

//    --------------------------------
static long maxSubarraySum(int arr[], int n){
    long sum = 0, maxsum = Long.MIN_VALUE, maxsum_neg = Long.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        sum += arr[i];

        if (sum<0) {
            sum = 0;
        }
        maxsum = Math.max(sum, maxsum);
        maxsum_neg = Math.max(arr[i], maxsum_neg);
    }
    if (maxsum == 0) {
        maxsum = maxsum_neg;
    }
    System.out.println(maxsum);
    return maxsum;
}


    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr1[] = { 1, -2, 6, -1, 3 };
        int arr2[] = { -12, -1, -6, -2, -3 };
        int arr3[] = {25, -83, -66, 100, -77, 79, -98, -60, -47, 70, -6, -22,
                98, -17, -100, -1, -99, 62, -91, -54 ,-90, -96, 67, 37, -60, -61};
        kadanesAlgorithm(arr2);
        kadanesAlgorithmNegative(arr3);

    }
}
