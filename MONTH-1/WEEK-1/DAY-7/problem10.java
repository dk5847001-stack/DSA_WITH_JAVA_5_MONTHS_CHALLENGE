import java.util.Scanner;
public class problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter the second number : ");
        int secondNum = input.nextInt();

        if(firstNum >= secondNum) {
            System.out.println("Difference : " + (firstNum - secondNum));
        }else{
            System.out.println("Difference : " + (secondNum - firstNum));
        }
        input.close();
    }
}
