import java.util.Scanner;
public class digitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        n = Math.abs(n);
        int count = 0;
        while(n > 0) {
            n /= 10;
            count++;
        }
        System.out.println("Total Digits are : " + count);
        input.close();
    }
}
