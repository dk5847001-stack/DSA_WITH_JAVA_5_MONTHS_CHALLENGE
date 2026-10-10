    import java.util.Scanner;

    public class Q5 {
        static int searchElemend(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
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
            System.out.print("Enter a number, you want to find : ");
            int x = input.nextInt();
            int result = searchElemend(arr, x);
            if (result == -1) {
                System.out.println("The number, you entered, is not exist in the array.");
            } else {
                System.out.println(x + " is exist in the array.");
            }
            input.close();
        }
    }
