import java.util.Scanner;

public class mainAndSecondaryDiagonalSums {

    static int DiagonalSum(int[][] arr) {
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            mainDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][arr.length - 1 - i];
        }
        System.out.println("Secondary Diagonal Sum = " + secondaryDiagonalSum);
        return mainDiagonalSum;
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
        if (rows != cols) {
            System.out.println("rows and columns must be equal for diagonal sum.");
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
        int mainDiagonalSum = DiagonalSum(arr);
        System.out.println("Main Diagonal Sum = " + mainDiagonalSum);
        input.close();
    }
}
