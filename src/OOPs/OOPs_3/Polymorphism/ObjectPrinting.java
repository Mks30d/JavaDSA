package OOPs.OOPs_3.Polymorphism;

public class ObjectPrinting extends Object{

    int num;
    ObjectPrinting(int num) {
        this.num = num;
    }

    @Override // toString() of Object class as every class extends Object class
    public String toString() {
        return "=" + num;
    }

    public static void main(String[] args) {
        ObjectPrinting obj = new ObjectPrinting(55);

        //this will be printed w/o using toString() in class as if
        // toString() is not override then Object class toString() is called
        //OOPs.OOPs_3.Polymorphism.ObjectPrinting@15aeb7ab
        System.out.println(obj);
    }
}
