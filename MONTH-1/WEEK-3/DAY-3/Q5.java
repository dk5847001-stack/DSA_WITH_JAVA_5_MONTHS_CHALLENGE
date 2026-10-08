import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter element no. "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int largestNum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largestNum<arr[i]){
                largestNum = arr[i];
            }
        }
        System.out.println("Largest number : "+ largestNum);
        input.close();
    }
}
