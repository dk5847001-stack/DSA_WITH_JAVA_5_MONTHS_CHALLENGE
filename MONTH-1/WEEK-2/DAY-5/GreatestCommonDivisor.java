import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        int GCD = 0;
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive numbers only.");
            input.close();
            return;
        };
        int min = Math.min(num1, num2);
        for (int i = 1; i < min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                if (GCD < i) {
                    GCD = i;
                }
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThe GCD of " + num1 + " and " + num2 + " is " + GCD);
        input.close();
    }
}
