import java.util.Scanner;

public class findDuplicateElement {
    static void findDuplicates(int[] arr) {
        boolean isFoundDuplicateElement = false;
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            boolean appearedEarlier = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    appearedEarlier = true;
                    break;
                }
            }
            if (appearedEarlier) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isFoundDuplicateElement = true;
                    System.out.println("Duplicate Elements : " + arr[i] + " ");
                    break;
                }
            }
        }
        if (!isFoundDuplicateElement) {
            System.out.println("No duplicate element found.");
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
        System.out.println("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        findDuplicates(arr);
        input.close();
    }
}
