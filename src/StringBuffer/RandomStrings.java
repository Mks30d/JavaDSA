package StringBuffer;

import java.util.Random;

public class RandomStrings {

    public static void randomString(int n) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomChar = 97 + random.nextInt(1,26);
            sb.append((char)randomChar);
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(1,26));

        randomString(26);
    }
}
