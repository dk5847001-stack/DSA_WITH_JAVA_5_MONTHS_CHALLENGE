import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        if (number < 2) {
            do {
                System.out.println("Only allowed minimum 2.");
                System.out.print("Enter a number : ");
                number = input.nextInt();
            } while (number < 2);
        }
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        input.close();
    }
}
