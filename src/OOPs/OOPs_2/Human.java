package OOPs.OOPs_2;

public class Human {
    String name;
    int age;
     static long population;

    Human(String name, int age) {
        this.age = age;
        this.name = name;
        Human.population++;
    }

    public static void main(String[] args) {
        Human aman = new Human("aman", 19);
        Human rohan = new Human("rohan", 22);

        System.out.println(Human.population);
    }

}
