package Arrays;

public class TrappingRainwater {

    public static void trappingRainwater(int arr[], int width) {

        int n = arr.length;
        
        // Calculate left max boundary - array from left
        int left_max[] = new int[n];
        left_max[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(arr[i], left_max[i - 1]);
            // System.out.print(left_max[i] + " ");
        }

        // Calculate right max boundary - array from right
        int right_max[] = new int[n];
        right_max[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(arr[i], right_max[i + 1]);
            // System.out.println(right_max[i]);
        }

        // Loop
        int trapped_water = 0;
        for (int i = 0; i < n; i++) {

            // water_level = min(leftmax bound, rightmax bound)
            int water_level = Math.min(left_max[i], right_max[i]);
            // System.out.println(water_level);

            // trapped water = (water level - height) * width
            trapped_water += (water_level - arr[i]) * width;

        }
        System.out.println(trapped_water);

    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 0, 6, 3, 2, 5 }; // arr elements represent height of bars
        int arr1[]= {2,1,2};
        int width = 1;
        trappingRainwater(arr1, width);
    }
}
