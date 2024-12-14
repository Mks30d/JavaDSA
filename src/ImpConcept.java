public class ImpConcept {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");
        //sb, type is not actually String, but we can convert int String type using below code:
        System.out.println(sb.toString());

        char ch1 ='a';
//        ch.toString(); // not allowed
        Character.toString(ch1);

        Character ch2 = 'a';
        ch2.toString();

        int a = 10;
//        a.toString();
        System.out.println(Integer.toString(a));

        Integer b = 20;
        System.out.println(b.toString());


        //Answer
        //The hashCode() method in Java returns the same hash code for multiple strings when those strings have identical content.
        // The method hashCode() returns an integer representation of the string's content.
        // For strings with identical content, this value will be the same regardless of whether they are interned or created using new.
        //s1 and s2 are both string literals that hold the value "hello". In Java, string literals are interned, meaning they refer to the same instance in the String constant pool.
        //s3, on the other hand, is created using new String("hello"), which creates a new object in heap memory, separate from the interned string pool.

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        int referenceId1 = System.identityHashCode(s1);
        System.out.println("Reference ID: " +  referenceId1);
        System.out.println("Hash Code: " + s1.hashCode());

        int referenceId2 = System.identityHashCode(s2);
        System.out.println("Reference ID: " + referenceId2);
        System.out.println("Hash Code: " + s2.hashCode());

        int referenceId3 = System.identityHashCode(s3);
        System.out.println("Reference ID: " + referenceId3);
        System.out.println("Hash Code: " + s3.hashCode());


    }
}
