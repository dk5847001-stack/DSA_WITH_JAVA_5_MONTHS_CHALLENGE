/*
Q8/10 — Find Common Elements in Two ArrayLists
Medium
 ArrayList + HashSet


Task: Do ArrayList<Integer> banao aur dono lists mein jo common elements hain, unhe find karo. Har common element output mein sirf ek baar aana chahiye.

Input:
First ArrayList: 10 20 30 40 50 20
Second ArrayList: 30 40 60 70 10 40

Expected Output:
First ArrayList: [10, 20, 30, 40, 50, 20]
Second ArrayList: [30, 40, 60, 70, 10, 40]
Common elements: [10, 30, 40]

Conditions:
1. Dono lists ke liye ArrayList<Integer> use karna hai.
2. Common elements identify karne ke liye HashSet<Integer> use karna hai.
3. Common element output mein repeat nahi hona chahiye.
4. First ArrayList ke order ke according common elements print hone chahiye.
5. Original dono ArrayLists modify nahi honi chahiye.
Hint:
HashSet<Integer> secondSet = new HashSet<>(secondList);

Phir first list par loop chalao aur secondSet.contains(number) check karo. Ek additional HashSet se output duplicates avoid kar sakte ho.

Tumhara task: Complete Java program likho aur yahan paste karo. Main code review, dry run, time complexity aur score dunga. 💪
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class PracticeQ8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> firstNumbers = new ArrayList<>();
        ArrayList<Integer> secondNumbers = new ArrayList<>();
        System.out.print("Enter the size of first ArrayList: ");
        int firstList = input.nextInt();
        for (int i = 1; i <= firstList; i++) {
            System.out.print("Enter number " + i + " : ");
            int n = input.nextInt();
            firstNumbers.add(n);
        }

        System.out.print("Enter the size of second ArrayList: ");
        int secondList = input.nextInt();
        for (int i = 1; i <= secondList; i++) {
            System.out.print("Enter number " + i + " : ");
            int n = input.nextInt();
            secondNumbers.add(n);
        }
        System.out.println("First ArrayList: " + firstNumbers);
        System.out.println("Second ArrayList: " + secondNumbers);

        HashSet<Integer> secondSet = new HashSet<>(secondNumbers);
        HashSet<Integer> duplicateSet = new HashSet<>();
        ArrayList<Integer> duplicateNum = new ArrayList<>();
        for (int firstNumber : firstNumbers) {
            if (secondSet.contains(firstNumber)) {
                if (duplicateSet.add(firstNumber)) {
                    duplicateNum.add(firstNumber);
                }
            }
        }
        System.out.println("Common elements: " + duplicateNum);
        input.close();
    }
}
