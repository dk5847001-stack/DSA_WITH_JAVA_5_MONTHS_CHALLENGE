import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int oddSum = 0;
        for(int i = 1; i<=n; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " + ");
                oddSum += i;
            }
        }
        System.out.print(" = " + oddSum);
        input.close();
    }
}
