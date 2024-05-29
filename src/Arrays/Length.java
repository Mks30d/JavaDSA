package Arrays;

public class Length {
    public static void main(String[] args) {
        
        String st = "123";
        System.out.println(st.length()); // 3

        // index at______ 0___ 1___ 2
        String arr[] = { "1", "2", "3" };
        System.out.println(arr.length); // 3

        for (int i = 0; i < arr.length; i++) { // <
            System.out.println(arr[i] + ": " + i);
        }

        for (int i = 0; i <= arr.length - 1; i++) { // <=
            System.out.println(arr[i] + "= " + i);
        }

    }
}
