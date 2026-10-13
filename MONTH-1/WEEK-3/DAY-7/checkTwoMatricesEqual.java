import java.util.Scanner;

public class checkTwoMatricesEqual {
    static boolean isMatricesEqual(int[][] arrA, int[][] arrB) {
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                if (arrA[i][j] != arrB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MATRIX A");
        System.out.print("Enter rows :  ");
        int rowsA = input.nextInt();
        if (rowsA <= 0) {
            System.out.println("please enter a positive number.");
            input.close();
            return;
        }
        System.out.print("Enter columns :  ");
        int colsA = input.nextInt();
        if (colsA <= 0) {
            System.out.println("please enter a positive number.");
            input.close();
            return;
        }
        int[][] arrA = new int[rowsA][colsA];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                arrA[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRIX B");
        System.out.print("Enter rows :  ");
        int rowsB = input.nextInt();
        if (rowsB <= 0) {
            System.out.println("please enter a positive number.");
            input.close();
            return;
        }
        if (rowsA != rowsB) {
            System.out.println("Matrices could not be equal, because rows are different.");
            input.close();
            return;
        }
        System.out.print("Enter columns :  ");
        int colsB = input.nextInt();
        if (colsB <= 0) {
            System.out.println("please enter a positive number.");
            input.close();
            return;
        }
        if (colsA != colsB) {
            System.out.println("Matrices could not be equal, because columns are different.");
            input.close();
            return;
        }
        int[][] arrB = new int[rowsB][colsB];
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                arrB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.print(arrB[i][j] + " ");
            }
            System.out.println();
        }
        boolean isMatricesEqual = isMatricesEqual(arrA, arrB);
        if (isMatricesEqual) {
            System.out.println("Matrices are equals.");
        } else {
            System.out.println("Matrices are not equals.");
        }
        input.close();
    }
}
