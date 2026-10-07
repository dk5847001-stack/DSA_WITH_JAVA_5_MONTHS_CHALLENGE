import java.util.Scanner;

public class sumOfOneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Sum of 1 to " + n + " is : " + sum);
        input.close();
    }
}
