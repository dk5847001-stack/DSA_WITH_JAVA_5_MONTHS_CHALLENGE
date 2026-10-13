import java.util.Scanner;

public class rowAndColumnSums {

    static void sumOfRowsAndCols(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Rows " + (i+1) + " sum : " + sum);
        }
        System.out.println();

        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Columns " + (i+1) + " sum : " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = input.nextInt();
        if (rows <= 0) {
            System.out.println("rows must be positive.");
            input.close();
            return;
        }
        System.out.print("Enter columns : ");
        int cols = input.nextInt();
        if (cols <= 0) {
            System.out.println("columns must be positive.");
            input.close();
            return;
        }
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sumOfRowsAndCols(arr);
        input.close();
    }
}
