/*
Q7/10 — Sort an ArrayList
Medium
 ArrayList + Collections


Task: Ek ArrayList<Integer> mein numbers store karo aur unhe ascending order mein sort karo.

Input:
How many numbers: 6
Enter numbers: 50 10 40 20 60 30

Expected Output:
Original ArrayList: [50, 10, 40, 20, 60, 30]
Sorted ArrayList: [10, 20, 30, 40, 50, 60]

Conditions:
1. ArrayList<Integer> use karna hai.
2. User se numbers input lene hain.
3. Collections.sort() use karke ascending order mein sort karna hai.
4. Sorting se pehle original list print karni hai.
5. Sorting ke baad sorted list print karni hai.
Hint:
Collections.sort(num);

Tumhara task: Complete Java program likho aur yahan paste karo. Main code review, dry run, time complexity aur score dunga. 🔥
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class PracticeQ7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("How many numbers: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number!");
            input.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + " : ");
            int num = input.nextInt();
            numbers.add(num);
        }
        System.out.println("Original ArrayList: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
        input.close();
    }
}
