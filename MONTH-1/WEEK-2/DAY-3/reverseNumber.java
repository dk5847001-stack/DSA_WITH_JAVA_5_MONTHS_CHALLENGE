import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        int newNumber = 0;
        while(n>0){
            int lastDigit = n % 10;
            newNumber = newNumber * 10 + lastDigit;
            n /= 10;
        }
        System.out.println("Reverse Number : " + newNumber);
        input.close();
    }
}
