
import java.util.Scanner;

public class findSecondLargestElement {

    static Integer findSecondLargest(int[] arr) {

        if (arr == null || arr.length < 2) {
            return null;
        }

        int largestNum = arr[0];
        int secondLargestNum = 0;
        boolean isFoundSecondLargestNum = false;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largestNum) {

                secondLargestNum = largestNum;
                largestNum = arr[i];
                isFoundSecondLargestNum = true;

            } else if (arr[i] < largestNum) {

                if (!isFoundSecondLargestNum
                        || arr[i] > secondLargestNum) {

                    secondLargestNum = arr[i];
                    isFoundSecondLargestNum = true;
                }
            }
        }

        if (isFoundSecondLargestNum) {
            return secondLargestNum;
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            input.close();
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(
                "Enter element no. " + (i + 1) + ": "
            );
            arr[i] = input.nextInt();
        }

        System.out.print("Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Integer secondLargestNum = findSecondLargest(arr);

        if (secondLargestNum == null) {

            System.out.println(
                "\nSecond-largest distinct element does not exist."
            );

        } else {

            System.out.println(
                "\nSecond-largest distinct element: "
                + secondLargestNum
            );
        }

        input.close();
    }
}
