import java.util.Scanner;

public class Q9 {
    static void frequencyOfEveryElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (!alreadyCounted) {
                System.out.println(arr[i] + " occurs " + count + " times.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter elment no. " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        frequencyOfEveryElement(arr);
        input.close();

    }
}
