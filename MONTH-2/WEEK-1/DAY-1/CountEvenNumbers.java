
public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 11, 14 };
        int countEvenNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }
        System.out.println("Even numbers count: " + countEvenNumbers);
    }
}

// Time complexity: O(n), because if n = 5 then runs 5 times, and n = 10 then runs 10 times.
