/*
Create an instance variable name to store each student's name.
Create a static variable totalStudents to count all student objects created.
Create a constructor that accepts a student's name and increments totalStudents.
Create a non-static method display() that prints the student's name and the total number of students created.
Create three students, display their details, then create one more student and display the details again.
*/
class Student {
    String name;
    static int totalStudents = 0;

    Student(String name) {
        this.name = name;
        totalStudents++;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Total Students: " + totalStudents);
        System.out.println();
    }
}

public class StaticChallenge {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student("Dilkhush");
        Student s3 = new Student("Mohan");
        s1.display();
        s2.display();
        s3.display();
        Student s4 = new Student("Soni");
        s4.display();
    }
}
