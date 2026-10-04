import java.util.Scanner;

public class primeBetweenTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter second number : ");
        int secondNum = input.nextInt();
        System.out.print("Prime Number : ");
        for (int i = firstNum; i < secondNum; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
