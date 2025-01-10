package OOPs.OOPs_3.Polymorphism;

public class Numbers {

    void sum(int a, int b) {
        System.out.println(a+b);
    }

// sequence of same data type does not matter however sequence of different data type matters
// return type does not matter in polymorphism

//    int sum(int b, int a) {  // error
//        return  a+b;
//    }
    float sum(int a, float b) {
        return  a+b;
    }
//    void sum(int a, int b) {
//        System.out.println(a+b);
//    }

    /////////////////////////////////////
    void sum1(int a, float b) {
        System.out.println(a+b);
    }
    void sum1(float b, int a) {
        System.out.println(a+b);
    }

}
