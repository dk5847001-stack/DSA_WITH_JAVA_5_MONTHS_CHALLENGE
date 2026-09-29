import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter secont number : ");
        int secondNum = input.nextInt();
        System.out.print("Enter operator : ");
        String operator = input.next();

        switch (operator) {
            case "+":
                System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;

            case "-":
                System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;

            case "*":
                System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;

            case "/":
                if (secondNum == 0) {
                    System.out.println("cann't divisible by zero!");
                } else {
                    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                }
                break;

            default:
                System.out.println("Please enter a valid operator(ex: +, -, *, /)");
                break;
        }
        input.close();
    }
}
