import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no. " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
