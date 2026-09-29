import java.util.Scanner;

public class mixedProblem25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = input.nextInt();
        char grade;
        if (marks < 0 || marks > 100) {
            grade = 'I';
        } else if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // ------- switch ---------
        String result = switch (grade) {
            case 'A' -> "Exallent";
            case 'B' -> "Very good";
            case 'C' -> "Good";
            case 'D' -> "Fail";
            case 'I' -> "Invalid grade";
            default -> "Invalid grade";
        };
        System.out.println(result);
        input.close();
    }
}
