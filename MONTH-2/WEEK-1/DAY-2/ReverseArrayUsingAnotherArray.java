public class ReverseArrayUsingAnotherArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Original Array : ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nReversed Array : ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}

//Time complexity: O(n), Auxiliary space: O(n)