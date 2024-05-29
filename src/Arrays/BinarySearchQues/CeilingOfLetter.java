package Arrays.BinarySearchQues;

public class CeilingOfLetter {

    // ------------------- return char -----------------------
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int n = letters.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // return letters[start % n]; // OR
        if (start == n) {
            return letters[0];
        } else {
            return letters[start];
        }
    }

    // ------------------- floor of letter -----------------------
    public static char previousSmallestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int n = letters.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target <= letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (end == -1) {
            return letters[n - 1];
        } else {
            return letters[end];
        }

    }

    // ------------------- return index -----------------------
    public static int nextGreatestLetter1(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        int n = letters.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // return start % n; // OR
        if (start == n) {
            return 0;
        } else {
            return start;
        }
    }

    public static void main(String arg[]) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'f';

        System.out.println(nextGreatestLetter(letters, target));
        System.out.println(previousSmallestLetter(letters, target));

        // int result = nextGreatestLetter1(letters, target);
        // System.out.println(letters[result]);

    }
}
