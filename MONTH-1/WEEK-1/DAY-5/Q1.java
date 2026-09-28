import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if(num > 0) {
            System.out.println("This is positive number");
        }else if(num < 0) {
            System.out.println("This is negative number");
        }else{
            System.out.println("This is zero");
        }
        input.close();
    }
}
