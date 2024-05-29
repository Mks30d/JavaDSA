package Arrays;

public class SmallestLargest {

    static int[] minMax(int num[]) {

        int largest = Integer.MIN_VALUE, largest_index = 0; //Integer.MIN_VALUE mean -infinity
        int smallest = Integer.MAX_VALUE, smallest_index = 0; //Integer.MAX_VALUE mean +infinity
        
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
                largest_index = i;
            }
            if (smallest > num[i]) {
                smallest = num[i];
                smallest_index = i;
            }
        }
        System.out.println("Smallest: " + smallest + " at " + smallest_index);
        System.out.println("Largest: " + largest + " at " + largest_index);

        int result[] = { smallest, smallest_index, largest, largest_index };
        return result;
    }

    public static void main(String[] args) {
        int num[] = { 5, 1, 44, -9, 22, -5, 99 };

        int result[] = minMax(num);

        int smallest = result[0];
        int smallest_index = result[1];
        int largest = result[2];
        int largest_index = result[3];

        System.out.println("Smallest= " + smallest + " at index " + smallest_index);
        System.out.println("Largest= " + largest + " at index " + largest_index);

    }
}
