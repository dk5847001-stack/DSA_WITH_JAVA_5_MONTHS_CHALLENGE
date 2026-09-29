import java.util.Scanner;
public class findEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int count = 0;
        for(int i = 1; i<=n; i++) {
            if(i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total even numbers between 1 and " + n + " is : " + count);
        input.close();
    }
}
