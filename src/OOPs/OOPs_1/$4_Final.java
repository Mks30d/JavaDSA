package OOPs.OOPs_1;

class Student3 {
    int roll;
    String name;

    @Override
    protected void finalize() {
        System.out.println("Object destroyed");
    }
}

class Random {
    final int num = 55;
    String name;

    Random(String name) {
        this.name = name;
    }
}
public class $4_Final {
    public static void main(String[] args) {
        final int A = 33;  // always initialize while declaring
//        A =3; // Cannot assign a value to final variable 'A'
//        we cannot change value when it is primitive date type,
//        but if it is non-primitive then we can change the value, but we cannot reassign the it ;


        final Random rohan = new Random("Rohan");
        rohan.name = "other name";

//        rohan = new Random("new obj");
//        we cannot change value when it is primitive date type,
//        but if it is non-primitive then we can change the value, but we cannot reassign it as below ;


//        will assign
        Student3 obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new Student3();
        }
    }
}
