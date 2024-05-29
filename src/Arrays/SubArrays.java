package Arrays;

public class SubArrays {
    // A subarray is a contiguous part of array
    // A subsequence always maintains the relative order of the array elements
    // (i.e., increasing index)

    // ----------------- Print subArrays --------------
    public static void subArrays(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("  ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total subArrays: " + total);
    }

    // ----------------- Min and Max of subArrays --------------
    public static void subArraysMinMax(int arr[]) {

        // int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        // int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            // int min = arr[i], max = arr[i];
            for (int j = i; j < arr.length; j++) {
                int end = j, sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                System.out.print(sum+ " ");

                if (sum < min) {
                    min = sum;
                }
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println(" = " + min + ", " + max);
        }
        // System.out.println("Min: " + min + ", Max: " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 8, 1 };
        int arr1[] = { 1, -2, 6, -1, 3 };
        subArrays(arr);
        subArraysMinMax(arr1);
    }
}
