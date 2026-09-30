import java.util.Scanner;
public class sumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        do{
            System.out.print("Enter a number : ");
            n = input.nextInt();
            sum += n;
        }while(n != 0);
        System.out.println("Total sum : " + sum);
        input.close();
    }
}
