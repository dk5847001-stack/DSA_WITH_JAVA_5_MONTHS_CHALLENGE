import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a positive number : ");
            n = input.nextInt();
            if(n<=0){
                System.out.println("Invalid number");
            }
        }while(n<=0);
        System.out.print("Valid number");
        input.close();
    }
}
