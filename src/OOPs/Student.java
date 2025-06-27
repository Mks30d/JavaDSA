
class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student[name=" + name + ", id=" + id + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return id == other.id && name.equals(other.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Manish", 101);
        Student s2 = new Student("Manish", 101);

        System.out.println(s1); // Uses overridden toString()
        System.out.println(s1.equals(s2)); // Uses overridden equals()

    }
} 