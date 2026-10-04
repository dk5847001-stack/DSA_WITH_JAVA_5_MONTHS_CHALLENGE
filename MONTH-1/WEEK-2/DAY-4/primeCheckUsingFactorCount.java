import java.util.Scanner;

public class primeCheckUsingFactorCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int count = 0;
        if (number < 2) {
            System.out.println("This is not prime number.");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("The total factors of " + number + " are " + count + " so this is prime number.");
            } else {
                System.out
                        .println("The total factors of " + number + " are " + count + " so this is not prime number.");
            }
        }

        input.close();
    }
}
