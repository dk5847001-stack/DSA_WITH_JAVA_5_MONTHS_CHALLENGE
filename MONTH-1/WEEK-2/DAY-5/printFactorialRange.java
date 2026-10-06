import java.util.Scanner;

public class printFactorialRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of terms : ");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println(fact);
        }
        input.close();
    }
}
