import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int original = n;
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        if(reverse == original){
            System.out.print(original+" is a Palindrome number.");
        }else{
            System.out.print(original+" is not a Palindrome number.");
        }
        input.close();
    }
}
