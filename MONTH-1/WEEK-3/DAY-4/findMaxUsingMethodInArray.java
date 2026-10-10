import java.util.Scanner;

public class findMaxUsingMethodInArray {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1)+" : ");
            arr[i] = input.nextInt();
        }
        int result = findMax(arr);
        System.out.println("Max : " + result);
        input.close();
    }
}
