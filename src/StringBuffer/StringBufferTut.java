package StringBuffer;

import java.text.DecimalFormat;

public class StringBufferTut {

    public static void main(String[] args) {

        //Constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16
        //Constructor 2
        StringBuilder sb2 = new StringBuilder("12345");
        System.out.println(sb2.capacity());  // 16+5
        sb2.trimToSize(); //reduce the capacity to match the current length
        System.out.println(sb.capacity());  // Output: Matches the current length


        //Constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity()); //30

        sb.append("0123456789");
        String str = sb.toString();
        System.out.println(str);
        System.out.println(sb);

        sb.insert(1, "66");
        System.out.println(sb);

        sb.replace(1,3, "88");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //-----------------------
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println(df.format(5.555)); //06.56

    }
}
