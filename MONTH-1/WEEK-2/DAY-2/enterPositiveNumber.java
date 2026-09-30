import java.util.Scanner;

public class enterPositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive number : ");
            n = input.nextInt();
        } while (n <= 0);
        System.out.println("congratulations! program ended!, finally you entered a positive number.");

        input.close();
    }
}
