import java.util.Scanner;

public class IterativeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            input.close();
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is : " + fact);
        input.close();
    }
}

// Time complexity: O(n)
// Auxiliary space: O(1)