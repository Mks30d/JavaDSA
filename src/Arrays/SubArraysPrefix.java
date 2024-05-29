package Arrays;

public class SubArraysPrefix {

    public static void prefixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];

            System.out.println(prefix[i]);
        }
    }

    // --------- Max of subarray using prfix sum -----------
    public static void maxSubarray(int arr[]) {
        int maxsum = arr[0], minsum = arr[0], cursum = 0;
        int prefix_sum[] = new int[arr.length];

        // calculating prefix array
        prefix_sum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i];
            System.out.println(prefix_sum[i]);
        }

        // finding the max sum in a subarray using prefix array
        // int first = 0, last = 0;
        // int arr[] = { 1, -2, 6, -1, 3 };
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // int cursum = 0;
                // for (int j2 = i; j2 <=j; j2++) {
                // cursum= cursum+arr[j2];
                // }

                if (start == 0) {
                    cursum = prefix_sum[end];
                } else {
                    cursum = prefix_sum[end] - prefix_sum[start - 1];
                }

                if (maxsum < cursum) {
                    maxsum = cursum;
                    // first =i;
                    // last=j;
                }
                if (minsum > cursum) {
                    minsum = cursum;
                }
                System.out.print(cursum + " ");
            }
            System.out.println();
        }
        System.out.println("Min: " + minsum + ", Max: " + maxsum);
        // System.out.println(first + ", " + last);
    }

    // --------------------------------------------------------------
    public static void maxSubarray1(int arr[]) {
        int maxsum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int cursum = 0;
            for (int j = i; j < arr.length; j++) {
                cursum = cursum + arr[j];
                
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
                System.out.print(cursum + " ");
            }
            // System.out.println(" : "+ cursum+ " : "+ maxsum );
            System.out.println();
        }
        System.out.println(" : " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int arr1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // prefixSum(arr);
        maxSubarray(arr1);
        maxSubarray1(arr1);

    }
}
