import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        boolean isPrime = true;
        int count = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total prime number : " + count);
        input.close();
    }
}
