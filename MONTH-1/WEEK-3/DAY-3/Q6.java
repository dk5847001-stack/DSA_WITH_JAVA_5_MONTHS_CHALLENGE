import java.util.Scanner;

public class Q6 {
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
        int minimumNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (minimumNum > arr[i]) {
                minimumNum = arr[i];
            }
        }
        System.out.println("minimum number : " + minimumNum);
        input.close();
    }
}
