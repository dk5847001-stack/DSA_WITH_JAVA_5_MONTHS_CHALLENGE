import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int original = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (original == sum) {
            System.out.println("This is perfect number.");
        } else {
            System.out.println("This is not perfect number.");
        }
        input.close();
    }
}
