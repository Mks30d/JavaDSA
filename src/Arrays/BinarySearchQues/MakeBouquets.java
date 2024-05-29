package Arrays.BinarySearchQues;

import java.util.Arrays;

// BS-13. Minimum days to make M bouquets | Binary Search

public class MakeBouquets {

    // --------------- TC: O(N * log (max - min +1))
    public static int makeBouquets(int[] arr, int m, int k) {

        if (arr.length < m * k) { // edge case
            return -1;
        }
        int[] minMax = minMaxElement(arr);
        int start = minMax[0], end = minMax[1];
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (possibleOrNot(arr, mid, m, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    // ------------- checking whether m Bouquets is possible to form or not
    public static boolean possibleOrNot(int[] arr, int days, int m, int k) {

        int count = 0, noOfBouquets = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                count++;
            } else {
                noOfBouquets += count / k;
                count = 0;
            }
        }
        noOfBouquets += count / k;
        if (noOfBouquets >= m) {
            return true;
        }
        return false;
    }

    public static int[] minMaxElement(int[] arr) {

        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        return new int[] { min, max };
    }

    // --------------- Brute Force : TC- O(min - max +1)*N ------------------
    public static int makeBouquets_1(int[] arr, int m, int k) {
        if (arr.length < m * k) { // edge case
            return -1;
        }
        int[] minMax = minMaxElement(arr);
        int min = minMax[0], max = minMax[1];
        for (int i = min; i <= max; i++) {
            boolean checkPossibility = possibleOrNot(arr, i, m, k);

            if (checkPossibility) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2, k = 3; // m = no of bouquets, k = adjacent flowers required
        // String val = Arrays.toString(minMaxElement(arr));
        // System.out.println(val);

        // int[] minMax = minMaxElement(arr);
        // System.out.println("Minimum: " + minMax[0]);
        // System.out.println("Maximum: " + minMax[1]);

        // System.out.println(possibleOrNot(arr, 12, m, k));

        // System.out.println(makeBouquets_1(arr, m, k));
        System.out.println(makeBouquets(arr, m, k));

    }
}
