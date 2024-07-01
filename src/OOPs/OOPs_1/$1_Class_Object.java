package OOPs.OOPs_1;

//class : it is a template of an object and group of properties and function
//object : is an instance of a class
class Student {
    int roll;
    String name;
    float marks;
    int default_value = 88;
}

public class $1_Class_Object {

    public static void main(String[] args) {

        Student rohan = new Student();

        rohan.roll = 11;
        rohan.name = "Rohan";
        rohan.marks = 99;
        System.out.println(rohan.roll);  //11
        System.out.println(rohan.name);  // Rohan
        System.out.println(rohan.marks);  // 99.0
        System.out.println(rohan.default_value); // 88

        // reassigning rohan
        rohan = new Student();
        System.out.println(rohan.roll); //0
        System.out.println(rohan.name); // null
        System.out.println(rohan.marks); //0.0
        System.out.println(rohan.default_value); // 88

    }
}
