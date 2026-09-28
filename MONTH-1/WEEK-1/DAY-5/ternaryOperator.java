import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        long limit = Long.MAX_VALUE;
        System.out.println(limit);
        String result = number % 2 == 0 ? "Even" : "Odd";
        System.out.println("The number is : " + result);
        input.close();
    }
}