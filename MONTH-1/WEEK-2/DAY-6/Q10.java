import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.print("sum : " + sum);
        input.close();
    }
}
