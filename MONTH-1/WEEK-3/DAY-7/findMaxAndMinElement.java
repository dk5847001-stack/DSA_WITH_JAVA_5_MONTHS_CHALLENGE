import java.util.Scanner;
public class findMaxAndMinElement {
    static int fixMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int fixMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
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
        System.out.println("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMAXIMUM ELEMENT : "+ fixMax(arr));
        System.out.println("MINIMUM ELEMENT : "+ fixMin(arr));
        input.close();
    }
}
