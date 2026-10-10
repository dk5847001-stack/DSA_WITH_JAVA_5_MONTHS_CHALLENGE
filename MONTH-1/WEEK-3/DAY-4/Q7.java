import java.util.Scanner;

public class Q7 {
    static int countEvenNum(int[] arr) {
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }

        }
        return evenCount;
    }
    static int countOddNum(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }

        }
        return oddCount;
    }
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
        int evenCount = countEvenNum(arr);
        System.out.println("Total even number : "+ evenCount);
        int oddCount = countOddNum(arr);
        System.out.println("Total odd number : "+ oddCount);
        input.close();
    }
}
