package DSA_Questions.Placement.Remotestate;

import java.util.Arrays;
//1. Given a list of integers and a number K, return which contiguous elements of the list sum to K.
// For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4], since 2+3+4=9.

public class ContiguousSumArr {

    public static int[] contiguousSum(int[] arr, int target) {
        int sum = 0, start = 0, end = 0;
        int n = arr.length;



        for (int i = 0; i < n - 1; i++) {
            sum = arr[i];
            start = i;
            end = i;

            if (sum == target) {
                return new int[]{arr[i]};
            }

            for (int j = i + 1; j < n; j++) {

                if (sum == target) {
                    int[] newarr = new int[end - start + 1];
                    for (int k = 0; k < (end - start + 1); k++) {
                        newarr[k] = arr[start + k];
                    }
                    return newarr;
                }
                end = j;
                sum = sum + arr[j];

            }
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {
//        int[] arr = {90, 1};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {4,5};
        int target = 9;

        System.out.println(Arrays.toString(contiguousSum(arr, target)));
    }
}
