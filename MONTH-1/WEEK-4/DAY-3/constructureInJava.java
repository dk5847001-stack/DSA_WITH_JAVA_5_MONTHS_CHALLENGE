
public class constructureInJava {
    /*
     * Q2/5 — Constructors in Java
     * Goal: Learn how to initialize an object using a constructor.
     * Your task
     * Create a Java program that:
     * 1. Defines a Student class.
     * 2. Declares three instance variables: name, age, and rollNumber.
     * 3. Creates a parameterized constructor that initializes all three variables.
     * 4. Creates a displayDetails() method to print the student's details.
     * 5. In main(), creates two Student objects using different constructor
     * arguments.
     * 6. Displays both students' details.
     */
    static class Student {
        String name;
        int age;
        int rollNumber;

        Student(String studentName, int studentAge, int studentRollNumber) {
            this.name = studentName;
            this.age = studentAge;
            this.rollNumber = studentRollNumber;
        }

        public void displayDetails() {
            System.out.println("Name : " + this.name);
            System.out.println("Age : " + this.age);
            System.out.println("Roll Number : " + this.rollNumber);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 10, 41);
        Student s2 = new Student("Dilkhush", 19, 51);

        System.out.println("Student 1");
        s1.displayDetails();
        System.out.println("\nStudent 2");
        s2.displayDetails();
    }
}
