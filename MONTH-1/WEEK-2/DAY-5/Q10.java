import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
        int count = 0;
        while (fact > 0) {
            int lastDigit = fact % 10;
            if (lastDigit == 0) {
                count++;
            }
            fact /= 10;
        }
        System.out.println("The number of trailing zeros in the factorial is " + count);
        input.close();
    }
}
