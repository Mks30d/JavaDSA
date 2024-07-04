package OOPs.OOPs_1;

public class WrapperExample {

//    a and b are primitive data type and they are passed by value as there is no such thing as pass by reference,
//    but when we pass object reference value is passed
    static void swap1(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

//    here a and b are object even though swapping is not done in main as Integer class is final
    static void swap2(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int n = 10;

        Integer num = 44;
        System.out.println(num);
//        "num" can access many fun available in Integer wrapper class but "n" can't
        System.out.println(num.compareTo(55));

        int a =3, b=20;
        swap1(a, b);
        System.out.println(a+", "+b);

        Integer x =3, y=20;
        swap2(x, y);
        System.out.println(x+", "+y);
    }
}
