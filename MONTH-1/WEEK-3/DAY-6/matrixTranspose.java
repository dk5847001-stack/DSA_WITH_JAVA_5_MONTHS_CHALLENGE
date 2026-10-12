import java.util.Scanner;

public class matrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = input.nextInt();
        System.out.print("Enter columns : ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "] : ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("\nOriginal Matrix : ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nTranspose of Matrix : ");
        int[][] newArr = new int[cols][rows];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                 newArr[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i<newArr.length; i++){
            for(int j = 0; j<newArr[i].length; j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
