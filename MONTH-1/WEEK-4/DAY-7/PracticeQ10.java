
/*
Q10/10 — Merge Two ArrayLists and Remove Duplicates
Final Challenge
 Medium

Topics: ArrayList + HashSet + LinkedHashSet
Task
Do ArrayList<Integer> banao. Dono lists ke elements ko ek saath merge karo aur duplicate elements remove karo.

Input:
First ArrayList: 10 20 30 40 20
Second ArrayList: 30 50 60 10 70

Expected Output:
First ArrayList: [10, 20, 30, 40, 20]
Second ArrayList: [30, 50, 60, 10, 70]
Merged ArrayList: [10, 20, 30, 40, 50, 60, 70]

Conditions
1. Dono lists ke liye ArrayList<Integer> use karna hai.
2. Dono lists ko merge karna hai.
3. Duplicate elements remove karne hain.
4. First occurrence ka insertion order preserve karna hai.
5. Final result ArrayList<Integer> hona chahiye.
6. Original dono ArrayLists modify nahi honi chahiye.
Hint
LinkedHashSet insertion order preserve karta hai aur duplicate elements automatically remove karta hai.
LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();

uniqueNumbers.addAll(firstNumbers);
uniqueNumbers.addAll(secondNumbers);

Final result ko ArrayList mein convert karne ke liye:
ArrayList<Integer> mergedNumbers =
        new ArrayList<>(uniqueNumbers);

Your challenge 💪
Complete Java program khud likho aur yahan paste karo.

Main check karunga:
- Code correctness
- Dry run
- Time and space complexity
- All 6 conditions
- Final score out of 10
Iske baad tumhare Week 4 ke 10 practice questions complete ho jayenge! 🏆
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PracticeQ10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to add in the first ArrayList: ");
        int num1 = input.nextInt();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 1; i <= num1; i++) {
            System.out.print("Enter number " + i + " : ");
            int n = input.nextInt();
            numbers1.add(n);
        }
        System.out.print("How many numbers you want to add in the second ArrayList: ");
        int num2 = input.nextInt();
        for (int i = 1; i <= num2; i++) {
            System.out.print("Enter number " + i + " : ");
            int n = input.nextInt();
            numbers2.add(n);
        }
        System.out.println("First ArrayList: " + numbers1);
        System.out.println("Second ArrayList: " + numbers2);
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
        uniqueNumbers.addAll(numbers1);
        uniqueNumbers.addAll(numbers2);
        ArrayList<Integer> mergeNumbers = new ArrayList<>(uniqueNumbers);
        System.out.println("Merged ArrayList: " + mergeNumbers);
        input.close();
    }
}
