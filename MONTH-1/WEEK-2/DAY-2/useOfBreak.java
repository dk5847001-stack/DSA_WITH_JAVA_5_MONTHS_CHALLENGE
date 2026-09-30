import java.util.Scanner;
public class useOfBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number who want to print till : ");
        int number = input.nextInt();
        System.out.print("Enter a positive number who want to break that : ");
        int breakNumber = input.nextInt();
        for(int i = 1; i <= number; i++) {
            if(i == breakNumber) {
                break;
            }
            System.out.print(i + " ");
        }
        input.close();
    }
}
