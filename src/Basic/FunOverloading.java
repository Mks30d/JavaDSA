public class FunOverloading {

    // Function Overloading, multiple fun. with the same name but different type of parameters or no, of parameters.It does not depends on return type.
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    // Error
    // public static float sum(int a, int b){
    // int sum = a+b;
    // return sum;
    // }

    public static float sum(int a, float b) {
        float sum = a + b;
        return sum;
    }
    public static double sum(int a, float b, double c) {
        double sum = a + b + c;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(3, 3));
        System.out.println(sum(3, 4.7f));
        System.out.println(sum(3, 4.7f, 0.3));
        System.out.println(sum(3, 4.7f, 0.3f));
        System.out.println(sum(3, 3, 3));
    }
}
