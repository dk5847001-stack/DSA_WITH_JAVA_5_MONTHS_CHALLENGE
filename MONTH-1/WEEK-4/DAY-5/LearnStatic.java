class Student {
    static  String college = "ABC college";
    String name;
}
public class LearnStatic {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Rahul";
        s2.name = "Priya";
        Student.college = "XYZ college";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(Student.college);
    }
}
