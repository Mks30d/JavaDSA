package OOPs.OOPs_2;

class Test1 {
    static String name;
    public Test1(String name) {
        Test1.name = name;
    }
}

public class _3_InnerClasses {

    // Test2 is not dependent on the object of _3_InnerClasses class, to use Test2 object of _3_InnerClasses is not
    // needed to be created
    static class Test2 {
        String name;
        public Test2(String name) {
            this.name = name;
        }
    }

    // This class itself depended on outer class, to use Test3 object of _3_InnerClasses class is needed
    class Test3 {
        String name;
        public Test3(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test1 a = new Test1("Rohan");
        Test1 b = new Test1("Aman");
        System.out.println(a.name);
        System.out.println(b.name);

        Test2 x = new Test2("Rohan");
        Test2 y = new Test2("Aman");
        System.out.println(x.name);
        System.out.println(y.name);


//  Error as Test3 is non-static and cannot be used in static function
//  non-static variable "this" cannot be referenced from a static context
//        Test3 i = new Test3("Rohan");
//        Test3 j = new Test3("Aman");
    }
}

// outside classes cannot be static b/c it itself not depended on any class
//static class A {}