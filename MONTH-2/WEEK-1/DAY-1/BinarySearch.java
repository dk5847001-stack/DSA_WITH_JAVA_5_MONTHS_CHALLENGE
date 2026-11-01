
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12 };
        int target = 10;
        int low = 0;
        int high = arr.length - 1;
        int mid;
        boolean isFound = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Target found at index " + mid);
                isFound = true;
                return;
            }
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        if (!isFound) {
            System.out.println("Target not found!");
        }
    }
}

// Time complexity: O(n), because increase the size of n may be operations are
// increase corresponding n and traverse each element.
/*
Best case: O(1)
Average case: O(log n)
Worst case: O(log n)
Auxiliary space: O(1)
*/