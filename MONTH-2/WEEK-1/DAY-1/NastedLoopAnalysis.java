import java.util.Scanner;

public class NastedLoopAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        input.close();
    }
}

// Time complexity: O(n2 (2=power)), because if outer loop runs 1 times then inner loop runs n times, nxn = n2 => O(n2)
