import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int copy = n;
        int reverse = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        if(copy == reverse) {
            System.out.println(copy + " is a palindrome number.");
        }else{
            System.out.println(copy + " is not a palindrome number.");
        }
        input.close();
    }
}
