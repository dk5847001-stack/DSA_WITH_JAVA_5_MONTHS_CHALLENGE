/*
Q6/10 — Find Duplicate Elements in ArrayList
Medium
 ArrayList + HashSet

Q6 ka question ab solve karo:

Task: Ek ArrayList<Integer> mein duplicate elements find karo. Har duplicate number output mein sirf ek baar print hona chahiye.
Input:
10, 20, 30, 20, 40, 10, 50, 30, 60

Output:
Duplicate elements: [10, 20, 30]

Conditions:
1. ArrayList<Integer> use karna hai.
2. HashSet<Integer> use karna hai.
3. Duplicate elements identify karne hain.
4. Duplicate output mein repeat nahi hone chahiye.
5. Original ArrayList modify nahi honi chahiye.
6. Duplicate detection ka first-occurrence order preserve karna hai.
Hint:
if (!set.add(number)) {
    // Duplicate detected
}

Tumhara task: Complete Java program likho. 💪
*/

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class PracticeQ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();
        System.out.print("How many numbers you want to add in the ArrayList: ");
        int n = input.nextInt();
        HashSet<Integer> DuplicateSet = new HashSet<>();
        ArrayList<Integer> DuplicateNum = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + " : ");
            int number = input.nextInt();
            num.add(number);
            if (!numbers.add(number)) {
                if(DuplicateSet.add(number)){
                    DuplicateNum.add(number);
                }
            }
        }
        System.out.println("Duplicate elements: " + DuplicateNum);
        input.close();
    }
}
