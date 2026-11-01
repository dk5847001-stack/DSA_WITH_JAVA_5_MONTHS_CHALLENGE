/*
Q5/10 — Check Anagrams

Medium
 String + HashMap

Task: Do strings input lo aur check karo ki dono anagrams hain ya nahi.

Anagram ka matlab: Dono strings mein same characters same frequency ke saath hone chahiye, bas order different ho sakta hai.

Example 1:
Input:
listen
silent

Output:
Both strings are Anagrams.


Example 2:
Input:
hello
world

Output:
Both strings are NOT Anagrams.


Conditions:
1. Scanner se dono strings input leni hain.
2. HashMap<Character, Integer> use karna hai.
3. Character frequencies compare karni hain.
4. Case-sensitive comparison maintain karna hai.
5. Different lengths hone par directly anagram reject kar sakte ho.
Hint: First string ki frequency increase karo aur second string ke characters ki frequency decrease karo. End mein sab frequencies zero honi chahiye.

Is baar tum khud logic design karna. Complete Java program bhejna, main review karunga. 💪
*/

import java.util.Scanner;
import java.util.HashMap;

public class PracticeQ5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String firstStr = input.nextLine();
        firstStr = firstStr.trim();
        if (firstStr.length() == 0) {
            System.out.println("String should not be empty!");
            input.close();
            return;
        }
        System.out.print("Enter second String: ");
        String secondStr = input.nextLine();
        secondStr = secondStr.trim();
        if (secondStr.length() == 0) {
            System.out.println("String should not be empty!");
            input.close();
            return;
        }
        if (firstStr.length() != secondStr.length()) {
            System.out.println("Both strings are NOT Anagrams.");
            input.close();
            return;
        }
        HashMap<Character, Integer> firstMapStr = new HashMap<>();
        HashMap<Character, Integer> secondMapStr = new HashMap<>();
        for (int i = 0; i < firstStr.length(); i++) {
            char ch = firstStr.charAt(i);
            char ch2 = secondStr.charAt(i);
            firstMapStr.put(ch, firstMapStr.getOrDefault(ch, 0) + 1);
            secondMapStr.put(ch2, secondMapStr.getOrDefault(ch2, 0) + 1);
        }
        System.out.println(firstMapStr);
        System.out.println(secondMapStr);
        if(firstMapStr.equals(secondMapStr)){
            System.out.println("Both strings are Anagrams.");
        }else{
            System.out.println("Both strings are NOT Anagrams.");
        }
        input.close();
    }
}
