package OOPs.OOPs_1;

class Student1 {
    int roll;
    String name;
    float marks;
    Student1(){
        // this keyword refers to the current object, as we need one word to access every object
        this.roll = 11;  // rohan.roll = 11;
        this.name = "Rohan";  //  rohan.name = "Rohan";
        this.marks = 99;  //  rohan.marks = 99;
    }

    Student1(int roll, String name, float marks){
//        roll = roll;
//        name = name;
//        marks = marks;
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    Student1(int rno, String naam){
        roll = rno;
        name = naam;
    }

    void greeting() {
        System.out.println("Hello..."+ name);
        System.out.println("Hello..."+ this.name);  // rohan.name
    }
}

public class $2_Constructor_this {

    public static void main(String[] args) {
        Student1 rohan = new Student1();
        Student1 aman = new Student1(44, "Aman", 93.5f);

//        rohan.roll = 11;
//        rohan.name = "Rohan";
//        rohan.marks = 99;

        System.out.println(rohan.roll);  //11
        System.out.println(rohan.name);  // Rohan
        System.out.println(rohan.marks);  // 99.0

//        rohan.greeting();

    }
}
