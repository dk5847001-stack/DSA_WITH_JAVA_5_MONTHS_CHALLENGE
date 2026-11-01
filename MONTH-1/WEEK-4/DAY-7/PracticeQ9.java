/*
Q9/10 — Sort ArrayList in Descending Order
Medium
 ArrayList + Collections + Comparator


Task: Ek ArrayList<Integer> mein numbers store karo aur unhe descending order (largest to smallest) mein sort karo.

Input:
How many numbers: 7
Enter numbers: 25 10 50 30 5 40 20

Expected Output:
Original ArrayList: [25, 10, 50, 30, 5, 40, 20]
Descending ArrayList: [50, 40, 30, 25, 20, 10, 5]

Conditions:
1. ArrayList<Integer> use karna hai.
2. User se numbers input lene hain.
3. Sorting se pehle original list print karni hai.
4. Collections.sort() ke saath Comparator.reverseOrder() use karna hai.
5. Sorting ke baad descending list print karni hai.
6. Original list ko separately preserve karne ki zaroorat nahi hai; bas sorting se pehle print karna hai.
Hint:
Collections.sort(numbers, Comparator.reverseOrder());

Tumhara task: Complete Java program likho aur yahan paste karo.

Main tumhara code review, dry run, time complexity aur score dunga.

Chalo dost, dekhte hain descending sorting kitni achhi samajh aayi hai! 💪
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PracticeQ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            input.close();
            return;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + " : ");
            int num = input.nextInt();
            numbers.add(num);
        }
        System.out.println("Original ArrayList: " + numbers);
        Collections.sort(numbers);
        System.out.println("Assending Ordered ArrayList: " + numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println("Dessending Ordered ArrayList: " + numbers);
        input.close();
    }
}
