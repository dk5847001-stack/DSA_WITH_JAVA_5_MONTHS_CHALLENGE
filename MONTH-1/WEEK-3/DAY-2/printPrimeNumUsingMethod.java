import java.util.Scanner;

public class printPrimeNumUsingMethod {
    static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrimeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }


    public static void main(String[] args) {
            printPrimeNumber();
    }
}
