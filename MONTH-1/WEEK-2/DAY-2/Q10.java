import java.util.Scanner;

public class Q10 {
    /*
     * 1. Add
     * 2. Subtract
     * 3. Multiply
     * 4. Exit
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int choise;
        do {
            System.out.println("============ MENU ===========");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");
            System.out.println();

            System.out.print("Enter your choise : ");
            choise = input.nextInt();

            System.out.print("Enter first number : ");
            num1 = input.nextInt();
            System.out.print("Enter second number : ");
            num2 = input.nextInt();

            int result = switch (choise) {
                case 1 -> (num1 + num2);
                case 2 -> (num1 - num2);
                case 3 -> (num1 * num2);
                default -> {
                    System.out.println("Invalid choise. Please try again.");
                    yield 0;
                }
            };
            System.out.println("Result : " + result);

        } while (choise != 4);
        input.close();
    }
}
