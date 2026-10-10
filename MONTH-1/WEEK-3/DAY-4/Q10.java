import java.util.Scanner;

public class Q10 {
    /*
     * Maximum element
     * Minimum element
     * Sum of all elements
     * Average
     * User ke diye hue target ki frequency
     */
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static double findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }

    static int findFrequencyOfTarget(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter a number you want to find : ");
        int x = input.nextInt();
        int count = findFrequencyOfTarget(arr, x);
        System.out.println("MAXIMUM ELEMENT : " + findMax(arr));
        System.out.println("MINIMUM ELEMENT : " + findMin(arr));
        System.out.println("AVERAGE ELEMENT : " + findAvg(arr));
        System.out.println("SUM OF ALL ELEMENT : " + findSum(arr));
        if (count == 0) {
            System.out.println(x + " is not found in the array.");
        } else {
            System.out.println(x + " is found in the array " + count + " times.");
        }
        input.close();
    }
}
