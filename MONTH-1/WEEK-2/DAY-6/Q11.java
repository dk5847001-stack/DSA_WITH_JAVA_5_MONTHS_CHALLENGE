import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int totalEvenNumber = n / 2;
        System.out.print("Total even numbers : " + totalEvenNumber);
        input.close();
    }
}
