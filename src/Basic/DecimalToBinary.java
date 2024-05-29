public class DecimalToBinary {

    public static void decimalToBinary(int num) {
        int num1 = num, binary = 0;

        for (int i = 0; num > 0; i++) {
            int rem = num % 2;
            binary = binary + (rem * (int) Math.pow(10, i));
            num = num / 2;
        }
        System.out.println("Binary of "+num1 +"= "+ binary);
    }

    public static void main(String[] args) {
        int num = 10;
        decimalToBinary(1);
        decimalToBinary(2);
        decimalToBinary(3);
        decimalToBinary(4);
        decimalToBinary(5);
        decimalToBinary(6);
        decimalToBinary(7);
        decimalToBinary(8);
        decimalToBinary(9);
        decimalToBinary(10);
        decimalToBinary(12);
        decimalToBinary(15);
    }
}