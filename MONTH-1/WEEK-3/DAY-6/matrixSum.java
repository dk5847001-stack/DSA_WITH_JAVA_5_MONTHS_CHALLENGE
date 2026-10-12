import java.util.Scanner;

public class matrixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int rows = input.nextInt();
        System.out.print("Enter no of columns : ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element " + "[" + i + "]" + "[" + j + "]" + " : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Total sum of array : " + sum);
        input.close();
    }
}
