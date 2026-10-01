import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Total sum of digits : " + sum);
        input.close();
    }
}
