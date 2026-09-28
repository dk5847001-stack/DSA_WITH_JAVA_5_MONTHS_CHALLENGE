import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if(num % 5 == 0 &&  num % 3 == 0) {
            System.out.println("Divisible by both");
        }else {
            System.out.println("Not divisible by both");
        }
        input.close();
    }
}
