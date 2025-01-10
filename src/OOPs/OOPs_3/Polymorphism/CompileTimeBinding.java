package OOPs.OOPs_3.Polymorphism;


class Parent {
    int x = 10;
    void show() {
        System.out.println("Parent show: x = " + x);
    }
}

class Child extends Parent {
    int x = 20;
    void show() {
        System.out.println("Child show: x = " + x);
    }
}

public class CompileTimeBinding {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.x); // Output: 10 (from Parent)
        obj.show();                // Output: "Child show: x = 20"

        Child obj1 = new Child();
        System.out.println(obj1.x);
    }
}

