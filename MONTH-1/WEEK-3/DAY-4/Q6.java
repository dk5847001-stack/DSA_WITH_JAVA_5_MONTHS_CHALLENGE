import java.util.Scanner;

public class Q6 {
    static int frequencyOfTarget(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
            return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter a number, you want to find : ");
        int x = input.nextInt();
        int result = frequencyOfTarget(arr, x);
        if (result == 0) {
            System.out.println(x + " is not find in the array.");
        } else {
            System.out.println(x + " is find in the array " + result + " times.");
        }
        input.close();
    }
}
