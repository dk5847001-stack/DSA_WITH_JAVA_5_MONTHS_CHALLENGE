/*
Q4/10 — Find First Non-Repeating Character
Medium
 HashMap + String

Task: Ek string input lo aur uska first non-repeating character find karo.

Example:
Input: programming

Output:
First non-repeating character: p

Conditions:
1. Scanner se input lena hai.
2. HashMap<Character, Integer> use karna hai.
3. Character frequency calculate karni hai.
4. First non-repeating character find karna hai.
5. Agar koi non-repeating character nahi hai, toh appropriate message print karna hai.
6. Original string ka order preserve karna hai.
Hint: Is problem ko solve karne ke liye two-pass approach use karo:
- First pass: Har character ki frequency calculate karo.
- Second pass: Original string ko dobara traverse karo. Jiski frequency 1 ho, wahi first non-repeating character hai.
Tumhara task: Complete Java program likho. Ismein getOrDefault() use karna. 💪
*/

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class PracticeQ4 {
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
        LinkedHashMap<Character, Integer> mapName = new LinkedHashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            mapName.put(ch, mapName.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mapName.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("first non-repeating character = " + entry.getKey());
                input.close();
                return;
            }
        }
        System.out.println("No non-repeating character found!");
        input.close();
    }
}
