import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int reverseNum = 0;
        while(n>0){
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            n /= 10;
        }
        System.out.print("The reverse number : " + reverseNum);
        input.close();
    }
}
