import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                secondLargestNum = largestNum;
                largestNum = arr[i];
            } else if (arr[i] < largestNum && arr[i] > secondLargestNum) {
                secondLargestNum = arr[i];
            }
        }
        System.out.println("Largest Element : " + largestNum);
        System.out.println("Second Element : " + secondLargestNum);
        input.close();
    }
}
