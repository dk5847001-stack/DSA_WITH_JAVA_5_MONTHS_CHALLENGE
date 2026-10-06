import java.util.Scanner;

public class factorialOfn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long n = input.nextLong();
        long fact = 1;
        if (n == 0) {
            System.out.print("The factorial of 0 is 1.");
        } else if (n < 0) {
            System.out.print("Please enter a positive number.");
        } else {
            for (long i = n; i >= 1; i--) {
                fact = fact * i;
            }
            if (fact <= 0) {
                System.out.println("The factorial of " + n + " is too large to be calculated.");
            } else {
                System.out.println("The factorial of " + n + " is " + fact);
            }
        }
        input.close();
    }
}
