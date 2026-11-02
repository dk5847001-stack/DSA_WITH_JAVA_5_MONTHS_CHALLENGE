
/*
User se n input le.
int[] arr = new int[n] create kare.
Array ke elements input le.
Ek second array int[] copy = new int[n] create kare.
Original array ke elements second array mein copy kare.
Dono arrays print kare.
Time Complexity aur Auxiliary Space batao.
*/
import java.util.Scanner;

public class ArrayCopying {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (1 + i) + " : ");
            arr[i] = input.nextInt();
        }
        int[] copy = new int[n];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = arr[i];
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nCopying Array: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        input.close();
    }
}

// Time complexity: O(n)
// Auxiliary space: O(n)