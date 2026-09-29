import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        if(num > 0) {
            if(num % 2 == 0) {
                System.out.println(num + " is positive even number");
            }else {
                System.out.println(num + " is positive odd number");
            }
        }else if(num < 0) {
            if(num % 2 == 0) {
                System.out.println(num + " is negative even number");
            }else{
                System.out.println(num + " is negative odd number");
            }
        }else {
            System.out.print("This is zero number!");
        }
        input.close();
    }
}
