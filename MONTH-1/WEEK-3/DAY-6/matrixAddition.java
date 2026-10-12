import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MATRIX A : ");
        System.out.print("Enter no of rows : ");
        int rowsA = input.nextInt();
        System.out.print("Enter no of columns : ");
        int colsA = input.nextInt();
        int[][] arrA = new int[rowsA][colsA];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print("Enter element " + "[" + i + "]" + "[" + j + "]" + " : ");
                arrA[i][j] = input.nextInt();
            }
        }
        System.out.println("MATRIX A : ");
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                System.out.print(arrA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MATRIX B : ");
        int[][] arrB = new int[rowsA][colsA];
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.print("Enter element " + "[" + i + "]" + "[" + j + "]" + " : ");
                arrB[i][j] = input.nextInt();
            }
        }
        System.out.println("MATRIX B : ");
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrB[i].length; j++) {
                System.out.print(arrB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] arrC = new int[rowsA][colsA];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[i].length; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
            }
        }

        System.out.println("MATRIX C : ");
        for(int i = 0; i<arrC.length; i++){
            for(int j = 0; j<arrC[i].length; j++){
                System.out.print(arrC[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
