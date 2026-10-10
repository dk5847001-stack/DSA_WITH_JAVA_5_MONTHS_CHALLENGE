import java.util.Scanner;

public class Q8 {
    static int firstIndexOccurrence(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int lastIndexOccurrence(int[] arr, int target) {
        int lastIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIdx = i;
            }
        }
        return lastIdx;
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
        System.out.print("Enter a number you want to find : ");
        int x = input.nextInt();
        int firstIndexOccurrence = firstIndexOccurrence(arr, x);
        if (firstIndexOccurrence == -1) {
            System.out.println(x + " is not found in the array.");
        } else {
            int lastIndexOccurrence = lastIndexOccurrence(arr, x);
            System.out.println(x + " is found in the array and First occurrence index : " + firstIndexOccurrence
                    + " and Last occurrence index : " + lastIndexOccurrence);

        }
        input.close();
    }
}
