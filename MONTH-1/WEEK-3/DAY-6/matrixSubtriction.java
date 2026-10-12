import java.util.Scanner;

public class matrixSubtriction {
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
        System.out.print("Enter rows : ");
        int rowsB = input.nextInt();
        System.out.print("Enter columns : ");
        int colsB = input.nextInt();
        if(rowsA == rowsB && colsA == colsB){
        int[][] arrB = new int[rowsB][colsB];
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
                arrC[i][j] = arrA[i][j] - arrB[i][j];
            }
        }

        System.out.println("MATRIX C : ");
        for(int i = 0; i<arrC.length; i++){
            for(int j = 0; j<arrC[i].length; j++){
                System.out.print(arrC[i][j]+" ");
            }
            System.out.println();
        }
    }else{
        System.out.println("Rows and columns must be same for subtraction.");
    }
        input.close();
    }
}
