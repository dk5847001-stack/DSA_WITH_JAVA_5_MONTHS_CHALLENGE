import java.util.Scanner;

public class arrayOperations {
    /*
     * Array ke elements print karo.
     * Array ka sum calculate karo.
     * Maximum element find karo.
     * Kisi given value ko search karo aur uska index return karo; nahi mile toh -1
     * return karo.
     */
    static void printArray(int[][] arr) {
        System.out.println("Array : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumOfArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    static int[] searchElement(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    int[] newArr = { i, j };
                    // System.out.println("Element found, index (" + i + "," + j + ")");
                    return newArr;
                }
            }
        }
        int[] newArr = { -1, -1 };
        return newArr;
    }

    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

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
        printArray(arr);
        System.out.println("sum of array : " + sumOfArray(arr));
        System.out.println("Maximum element : " + findMax(arr));
        System.out.print("Enter a element you want to find : ");
        int a = input.nextInt();
        int[] isFound = searchElement(arr, a);
        if (isFound[0] == -1 && isFound[1] == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found, index : (" + isFound[0] + "," + isFound[1] + ")");
        }
        input.close();
    }
}
