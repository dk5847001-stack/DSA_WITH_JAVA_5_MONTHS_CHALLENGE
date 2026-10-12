import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MATRIX A : ");
        System.out.print("Enter rows : ");
        int rowsA = input.nextInt();
        System.out.print("Enter columns : ");
        int colsA = input.nextInt();
        int[][] arrA = new int[rowsA][colsA];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                arrA[i][j] = input.nextInt();
            }
        }
        System.out.println("\nMatrix A : ");
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix B : ");
        System.out.print("Enter rows : ");
        int rowsB = input.nextInt();
        System.out.print("Enter columns : ");
        int colsB = input.nextInt();
        if (colsA == rowsB) {
            int[][] arrB = new int[rowsB][colsB];
            for (int i = 0; i < arrB.length; i++) {
                for (int j = 0; j < arrB[i].length; j++) {
                    System.out.print("Enter element [" + i + "][" + j + "] : ");
                    arrB[i][j] = input.nextInt();
                }
            }
            System.out.println("\nMatrix B : ");
            for (int i = 0; i < arrB.length; i++) {
                for (int j = 0; j < arrB[i].length; j++) {
                    System.out.print(arrB[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nMatrix C : ");
            int[][] arrC = new int[rowsA][colsB];
            for (int i = 0; i < arrC.length; i++) {
                for (int j = 0; j < arrC[i].length; j++) {
                    int sum = 0;

                    for (int k = 0; k < colsA; k++) {
                        sum += arrA[i][k] * arrB[k][j];
                    }
                    arrC[i][j] = sum;
                }
            }
            System.out.println("\nMatrix C : ");
            for (int i = 0; i < arrC.length; i++) {
                for (int j = 0; j < arrC[i].length; j++) {
                    System.out.print(arrC[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("columns of Matrix A and rows of Matrix B must be equal for multiplication of matrix.");
        }
        input.close();
    }
}
