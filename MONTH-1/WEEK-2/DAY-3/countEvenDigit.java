import java.util.Scanner;
public class countEvenDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCount = 0;
        System.out.print("Enter number : ");
        int n = input.nextInt();
        while(n > 0) {
            int lastDigit = n % 10;
            if(lastDigit % 2 == 0){
                evenCount++;
            }
            n /= 10;
        }
        System.out.println("Total count of even digits are : " + evenCount);
        input.close();
    }
}
