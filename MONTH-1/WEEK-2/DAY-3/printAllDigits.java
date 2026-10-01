import java.util.Scanner;
public class printAllDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.print("Enter number : ");
        int n = input.nextInt();
        while(n > 0){
            digit = n % 10;
            System.out.print(digit + " ");
            n /= 10;
        }
        input.close();
    }
}
