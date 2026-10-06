import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        int A = a;
        int B = b;
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        int lcm = (A * B) / a;
        System.out.println("LCM : " + lcm);
        System.out.println("GCD : " + a);
        System.out.println("GCD + LCM : " + (a + lcm));

        input.close();

    }
}
