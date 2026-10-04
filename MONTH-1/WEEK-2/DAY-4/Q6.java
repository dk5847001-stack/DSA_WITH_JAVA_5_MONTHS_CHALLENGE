import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        boolean isPrime = true;
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                for (int j = 2; j <= i/j; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeCount++;
                }
            }
        }
        System.out.println();
        System.out.println("Total prime number : " + primeCount);
        input.close();
    }
}
