import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum = 0;
        System.out.print("0");
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(" + " + lastDigit);
            sum += lastDigit;
            n /= 10;
        }
        System.out.print(" = " + sum);
        input.close();
    }
}
