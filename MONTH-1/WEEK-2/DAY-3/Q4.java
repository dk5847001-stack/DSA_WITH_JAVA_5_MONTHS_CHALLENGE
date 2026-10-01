import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int product = 1;
        while(n > 0) {
            int lastDigit = n % 10;
            product *= lastDigit;
            n /= 10;
        }
        System.out.print("The product of all digits are : " + product);
        input.close();
    }
}
