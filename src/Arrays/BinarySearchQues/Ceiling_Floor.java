package Arrays.BinarySearchQues;

public class Ceiling_Floor {

    // ----------------------------------------------------
    // Ceiling number, smallest num greater or equal to target
    public static int ceilingOfNum(int[] arr, int target) {

        // if the target is grater than the greatest num in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start; // returning "start" instead of -1 in binary search, when target not found
    }

    // ----------------------------------------------------
    // FLoor number, greatest num smaller or equal to target
    public static int floorOfNum(int[] arr, int target) {

        // if target is the smaller num than the smallest num in the array
        if (target < arr[0]) {
            return -1;
        }

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end; // returning "end" instead of -1 in binary search, when target not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;

        int ceiling = ceilingOfNum(arr, target);
        if (ceiling != -1) {
            System.out.println("Ceilling: " + arr[ceiling] + " at " + ceiling);

        }
        int floor = floorOfNum(arr, target);
        if (floor != -1) {
            System.out.println("Floor: " + arr[floor] + " at " + floor);

        }

    }
}
