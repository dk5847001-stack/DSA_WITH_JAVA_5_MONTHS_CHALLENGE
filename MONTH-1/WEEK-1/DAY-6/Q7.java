import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = input.nextInt();
        char grade;
        if (marks < 0 || marks > 100) {
            System.out.println("Please enter a valid marks (marks should be 0 to 100)!");
        } else {
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            switch (grade) {
                case 'A':
                    System.out.println("Grade = " + grade);
                    System.out.println("Exallent");
                    break;
                case 'B':
                    System.out.println("Grade = " + grade);
                    System.out.println("Very Good");
                    break;
                case 'C':
                    System.out.println("Grade = " + grade);
                    System.out.println("Good");
                    break;
                case 'D':
                    System.out.println("Grade = " + grade);
                    System.out.println("Bad");
                    break;
                case 'E':
                    System.out.println("Grade = " + grade);
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Invalid grade");
                    break;
            }
        }
        input.close();
    }
}
