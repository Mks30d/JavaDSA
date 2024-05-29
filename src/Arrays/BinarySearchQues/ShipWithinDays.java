package Arrays.BinarySearchQues;

import java.util.Arrays;

public class ShipWithinDays {

    // -------------------TC: O (log(sum - max +1) * O(n))
    public static int shipWithinDays(int[] weights, int days) {
        Arrays.sort(weights);
        int sum = 0, ans = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        int start = weights[weights.length - 1], end = sum;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int numOfDays = reqDays(weights, mid);

            if (numOfDays <= days) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans; // or return start;
    }

    public static int reqDays(int[] weights, int capacity) {
        int days = 1, load = 0;

        for (int i = 0; i < weights.length; i++) {

            if (load + weights[i] <= capacity) {
                load += weights[i];
            } else {
                days++;
                load = weights[i];
            }
        }
        return days;
    }
    // -------------------random code-------

    public static int findDays(int cap, int[] weights) {
        int days = 1, total = 0;
        for (int i = 0; i < weights.length; i++) {
            if (total + weights[i] > cap) {
                days += 1;
                total = weights[i];
            } else {
                total += weights[i];
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] weights, int d) {
        int n = weights.length;
        int start = Arrays.stream(weights).max().getAsInt();
        int end = Arrays.stream(weights).sum();

        while (start <= end) {
            int mid = (start + end) / 2;
            int reqDays = findDays(mid, weights);
            if (reqDays <= d) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // ------------------- Brute force, TC: O ((sum - max +1) * O(n))
    public static int shipWithinDays_1(int[] weights, int days) {
        int max = weights[weights.length - 1], sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }

        for (int capacity = max; capacity <= sum; capacity++) {
            int numOfDays = reqDays(weights, capacity);
            if (numOfDays <= days) {
                return capacity;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;
        // int[] weights = { 3, 2, 2, 4, 1, 4 };
        // days = 3;
        // int[] weights = { 1, 2, 3, 1, 1 };
        // int[] weights = { 86, 45, 74, 64, 14, 68, 44, 11, 43, 33, 8, 20 };
        days = 12;
        int[] weights = { 409,289,390,449,243,24,80,233,462,17,372,378,436,146,347,379,362,139,359,267,242,94,195,211,67,460,334,362,465,201,68,421,121,234,352,71,19,412,320,187,136,487,266,487,472,158,358,450,301,303,100,476,102,36,371,219,193,201,102,282,243,292,463,253,204,41,297,370,35,449,229,230,460,267};
        days = 35;
        System.out.println(shipWithinDays(weights, days));
        System.out.println(leastWeightCapacity(weights, days));
        System.out.println(shipWithinDays_1(weights, days));
    }
}
