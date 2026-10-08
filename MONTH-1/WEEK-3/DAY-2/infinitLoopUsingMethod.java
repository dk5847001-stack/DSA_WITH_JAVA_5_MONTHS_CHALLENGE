import java.util.Scanner;

public class infinitLoopUsingMethod {
    static void multiply(int a, int b) {
        if (a == b) {
            System.out.print("program ended");
        } else {
            System.out.println("---------------");
            System.out.println("|  " + a + " X " + b + " = " + (a * b) + " |");
            System.out.println("---------------");
            input();
        }
    }

    static void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = input.nextInt();
        System.out.print("Enter second number : ");
        int b = input.nextInt();
        multiply(a, b);
        input.close();
    }

    public static void main(String[] args) {
        input();
    }
}
