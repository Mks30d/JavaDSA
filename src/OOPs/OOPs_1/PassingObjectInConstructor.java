package OOPs.OOPs_1;

class Student2{
    int roll;
    String name;

//    Student2 aman = new Student2(3, "Aman");
//    "this" will be replaced with "aman" in the below code
    Student2(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

//    another constructor that takes value from another object
//    Student2 random = new Student2(aman);
//    Student2 ( Student2 aman)
//    "this" will be replaced with "random" and  "other" with "aman"
    Student2 ( Student2 other) {
        this.roll = other.roll;
        this.name = other.name;
    }

//    Calling constructor from another constructor
    Student2() {
//    internally: new Student2(44, "default student)
        this (44, "default student");
//        new Student2(44, "default student"); // 0, null will be printed
    }
}
public class PassingObjectInConstructor {
    public static void main(String[] args) {

        Student2 aman = new Student2(3, "Aman");
        System.out.println(aman.roll);
        System.out.println(aman.name);


        Student2 random = new Student2(aman);
        System.out.println(random.roll);
        System.out.println(random.name);

        Student2 random2 = new Student2();
        System.out.println(random2.roll);
        System.out.println(random2.name);

    }
}
