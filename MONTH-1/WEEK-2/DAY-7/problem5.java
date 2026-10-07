import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int largestNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (largestNum < lastDigit) {
                largestNum = lastDigit;
            }
            n /= 10;
        }
        System.out.print("The largest digit : " + largestNum);
        input.close();

    }
}
