import java.util.Scanner;

public class reverseArrayUsingMethod {
    static void reverseArray(int[] arr) {
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("\nReverse Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            input.close();
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        reverseArray(arr);
        input.close();
    }
}
