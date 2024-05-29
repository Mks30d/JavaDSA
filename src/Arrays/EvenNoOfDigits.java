package Arrays;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNoOfDigits {

    public static int findNumbers(int[] nums) {

        int even = evenDigit(nums);

        return even;
    }

    public static int evenDigit(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int digLength = digitLength(num[i]);

            if (digLength % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // -------------- digit lenght 1st method ----------------
    public static int digitLength(int num) {
        if (num < 0) { // converting -ve into +ve
            num = num * -1;
            System.out.println("num: "+ num);
        }
        int count = Integer.toString(num).length();
        return count;
    }

    // -------------- digit lenght 2nd method ----------------
    public static int digitLength1(int num) {
        int count = 0;

        if (num < 0) { // converting -ve into +ve
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        for (int i = 0; num > 0; i++) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // -------------- digit lenght 3nd method ----------------
    public static int digitLength2(int num) {
        int count = (int) Math.log10(num) + 1;
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 12, 345, 2, 6, 7896 };
        int nums1[] = { 22, -555, -9901, 482, 1771, 00 };

        System.out.println(evenDigit(nums));
        System.out.println(evenDigit(nums1));

        // System.out.println(digitLength(540));
        // System.out.println(digitLength(-50));
        // System.out.println(digitLength(0));

        // System.out.println(Integer.toString(000).length());
        // System.out.println(Integer.toString(-111).length());
    }
}