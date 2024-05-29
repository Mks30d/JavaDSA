public class BinaryToDecimal {

    public static void binaryToDecimal(int num) {
        int deciaml = 0, num2 = num;

        for (int i = 0; num > 0; i++) {
            int lastdigit = num % 10;
            deciaml = deciaml + (lastdigit * (int) Math.pow(2, i));
            num = num / 10;

        }
        System.out.println("Deciaml of " + num2 + "= " + deciaml);
    }

    public static void main(String[] args) {
        int num = 101;

        binaryToDecimal(num);
        binaryToDecimal(00);
        binaryToDecimal(01);
        binaryToDecimal(10);
        binaryToDecimal(11);
        binaryToDecimal(100);
        binaryToDecimal(101);
        binaryToDecimal(110);
        binaryToDecimal(111);
        binaryToDecimal(1000);

    }
}
