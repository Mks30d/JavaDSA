package DSA_Questions;


public class SingleNumber {

    static int singleNumber(int[] nums) {
        int n = nums.length, element = 0;
        for (int i = 0; i < n; i++) {
            element = element ^ nums[i];
            System.out.println(element);
        }
        return element;
    }
    static int singleNumber1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
//        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));

    }
}
