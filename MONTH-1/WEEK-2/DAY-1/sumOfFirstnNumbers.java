import java.util.Scanner;
public class sumOfFirstnNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(" = " + sum);
        input.close();
    }
}
