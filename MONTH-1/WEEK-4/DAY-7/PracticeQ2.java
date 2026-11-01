/*
Q2/10 — Remove Duplicate Characters
Easy
 String + StringBuilder + HashSet

Task: Ek string input lo aur usme se duplicate characters remove karo. Character ka first occurrence preserve rehna chahiye.

Example:
Input: programming

Output: progamin

Conditions:
1. Scanner se input lena hai.
2. HashSet use karna hai.
3. StringBuilder use karna hai.
4. Character ka first occurrence preserve karna hai.
5. Case-sensitive behaviour maintain karna hai (A aur a alag hain).
Hint: HashSet.add() ka return value check karo. Agar character pehli baar add hua hai, tabhi StringBuilder mein append karo.

Complete Java program likho. Main tumhara logic, code quality aur output check karunga. 💪
*/

import java.util.Scanner;
import java.util.HashSet;

public class PracticeQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = input.nextLine();
        name = name.trim();
        if (name.length() == 0) {
            System.out.println("String should not be empty!");
            input.close();
            return;
        }
        HashSet<Character> hashName = new HashSet<>();
        StringBuilder nameBuilder = new StringBuilder();
        for(int i = 0; i<name.length(); i++){
            if(hashName.add(name.charAt(i))){
                nameBuilder.append(name.charAt(i));
            }
        }
        System.out.println(nameBuilder);
        input.close();
    }
}
