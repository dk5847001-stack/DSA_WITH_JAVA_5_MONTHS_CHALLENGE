import java.util.Scanner;

public class GCDusingComplexity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.print("GCD : " + a);
        input.close();
    }
}
