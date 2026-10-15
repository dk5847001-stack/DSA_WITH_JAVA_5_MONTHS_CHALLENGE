
public class basicOop {
    static class Student {
        String name;
        int age;

        public void displayDetails() {
            System.out.println("Name : " + this.name);
            System.out.println("Age : " + this.age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dilkhush";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "pujesh";
        s2.age = 20;
        System.out.println("Student 1");
        s1.displayDetails();
        System.out.println("\nStudent 2");
        s2.displayDetails();
    }
}
