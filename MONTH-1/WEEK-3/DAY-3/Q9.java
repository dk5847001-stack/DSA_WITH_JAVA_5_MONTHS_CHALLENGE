import java.util.Scanner;

public class Q9 {
    static void printArray(int n) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter a number which you find in the array : ");
        int num = input.nextInt();
        boolean isFind = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFind = true;
                System.out.println("Index : " + i);
                break;
            }
        }
        if (isFind) {
            System.out.println("Element found!");
        }else{
            System.out.println("Element not found!");
        }
        input.close();
    }

    static void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        printArray(n);
        input.close();
    }

    public static void main(String[] args) {
        input();
    }
}