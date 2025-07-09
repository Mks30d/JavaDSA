package DSA_Questions.Placement.Nagarro;

public class Arduino {

    public static int arduinoRobo(int[] arr) {
        int n = arr.length;
        int maxPos = 0, currPos = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                currPos = currPos + arr[j];
                maxPos = Math.max(maxPos, Math.abs(currPos));
            }
        }
        return maxPos;
    }

    public static void main(String[] args) {
//        int[] arr = {2,-1,-2}; // 5
        int[] arr = {2, -3, 1}; // 1
//        int[] arr = {-2,-1,-2}; // 10
//        int[] arr = {-1, -2, 1}; // 7

        System.out.println(arduinoRobo(arr));
    }
}
