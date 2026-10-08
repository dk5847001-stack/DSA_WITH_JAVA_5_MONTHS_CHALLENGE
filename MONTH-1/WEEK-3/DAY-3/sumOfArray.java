import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int sum = 0;
        System.out.print("0");
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            System.out.print(" + " + arr[i]);
        }
        System.out.print(" = " + sum);
        input.close();
    }
}
