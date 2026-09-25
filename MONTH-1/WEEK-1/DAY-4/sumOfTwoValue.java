import java.util.*;
public class sumOfTwoValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + sum);
    }
}
