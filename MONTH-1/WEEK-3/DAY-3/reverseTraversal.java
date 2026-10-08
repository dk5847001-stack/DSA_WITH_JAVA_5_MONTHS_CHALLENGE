import java.util.Scanner;

public class reverseTraversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Simple array-----");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse array-----");
        for(int i = 0; i<n; i++){
            System.out.print(arr[arr.length-1-i]+" ");
        }
        input.close();
    }
}
