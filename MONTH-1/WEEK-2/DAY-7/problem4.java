import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        int count = 0;
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.print("Total prime number : " + count);
        input.close();
    }
}
