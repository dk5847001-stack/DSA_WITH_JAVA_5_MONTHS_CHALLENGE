import java.util.Scanner;

public class FindTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}

// Time complexity: O(n), because increase the size of n, operations bhi badhta hai uske corresponding.