import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int totalPositiveNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                totalPositiveNum++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Totol positive number : " + totalPositiveNum);
        System.out.println();

        int totalNegativeNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                totalNegativeNum++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Totol negative number : " + totalNegativeNum);
        System.out.println();

        int totalZeroNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                totalZeroNum++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Totol zero number : " + totalZeroNum);
        input.close();
    }
}
