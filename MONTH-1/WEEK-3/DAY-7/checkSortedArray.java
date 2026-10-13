import java.util.Scanner;

public class checkSortedArray {
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
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
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean isSortedArray = isSorted(arr);
        if (isSortedArray) {
            System.out.println("\nArray is sorted.");
        } else {
            System.out.println("\nArray is not sorted.");
        }
        input.close();
    }
}
