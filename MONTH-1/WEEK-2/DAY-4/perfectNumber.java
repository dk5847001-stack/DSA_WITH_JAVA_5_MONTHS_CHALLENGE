import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int factSum = 0;
        System.out.print("[ 0");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                factSum += i;
                System.out.print(" + " + i);
            }
        }
        System.out.println(" = " + factSum + " ]");
        if (factSum == n) {
            System.out.println("This is perfect number.");
        } else {
            System.out.println("This is not perfect number.");
        }
        input.close();
    }
}
