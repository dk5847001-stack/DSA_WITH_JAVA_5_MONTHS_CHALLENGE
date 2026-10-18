class Student {
    static int count = 0;
    String name;

    Student(String name) {
        this.name = name;
        count++;
    }
}

public class StaticWithConstructure {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Soni");
        Student s3 = new Student("Payal");
        Student s4 = new Student("Dilkhush");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s4.name);
        System.out.println("Total student : " + Student.count);
    }
}
