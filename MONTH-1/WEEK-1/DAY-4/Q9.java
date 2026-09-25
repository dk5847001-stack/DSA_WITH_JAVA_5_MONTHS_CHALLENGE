import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = input.nextDouble();
        System.out.print("Enter third number : ");
        double num3 = input.nextDouble();
        double avg = (num1 + num2+num3)/3;
        System.out.println("Sum : " + (num1+num2 +num3));
        System.out.println("avg : " + (num1 +num2+num3) / 3);
        System.out.printf("avg : %.2f", avg);
        input.close();
    }
}
