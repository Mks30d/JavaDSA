package Arrays;
// https://leetcode.com/problems/richest-customer-wealth/

// Input: accounts = [[1,5], [7,3], [3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.
public class MaxWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxsum = Integer.MIN_VALUE;
        // i = person, j = account
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            // now we have sum of all account of a person
            if (maxsum <= sum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }

    //--------------------- foreach loop -------------------------
    public static int maximumWealth1(int[][] accounts) {
        int maxsum = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;

            for (int account : person) {
                sum = sum + account;
            }
            if (maxsum <= sum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        int[][] accounts1 = { { 1, 2, 3 }, { 3, 2, 1 } };
        int[][] accounts2 = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

        int result = maximumWealth(accounts2);
        System.out.println(result);
    }
}
