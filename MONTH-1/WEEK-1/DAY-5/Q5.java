import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = input.nextInt();
        if(marks > 100) {
            System.out.println("Invalid marks");
        }
        else if(marks >= 90 && marks <= 100) {
            System.out.println("A");
        }else if(marks >= 80) {
            System.out.println("B");
        }else if(marks >= 70) {
            System.out.println("C");
        }else if(marks >= 60) {
            System.out.println("D");
        }else if(marks < 60) {
            System.out.println("fail");
        }else{
            System.out.println("Invalid marks");
        }
        input.close();
    }
}
