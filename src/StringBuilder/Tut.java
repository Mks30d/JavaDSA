package StringBuilder;

public class Tut {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        //sb, type is not actually String, but we can convert int String type using below code:
        System.out.println(sb.toString());
        System.out.println(sb);
        System.out.println(sb.length());

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, '$');
        System.out.println(sb);

        sb.insert(1, 'h');
        System.out.println(sb);

        sb.delete(1, 1); // no element deleted
        sb.delete(1, 2);
        System.out.println(sb);


//        sb = "h";  // error
        sb = new StringBuilder("h");
        sb.append("i..");
        System.out.println(sb);

//        StringBuilder sb2 = new StringBuilder("mks->"); // or
        StringBuilder sb2 = new StringBuilder();
        for (char ch = 'a'; ch < 'h'; ch++) {
            sb2.append(ch);
        }
        System.out.println(sb2);
    }
}
