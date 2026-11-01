
/*
Q3/10 — Character Frequency Counter
Medium
 HashMap + String


Task: User se ek string input lo aur har character kitni baar aaya hai, uski frequency print karo.

Example:
Input: programming

Output:
p = 1
r = 2
o = 1
g = 2
a = 1
m = 2
i = 1
n = 1


Conditions:
1. Scanner se input lena hai.
2. HashMap use karna hai.
3. Character key (Character) aur frequency value (Integer) honi chahiye.
4. getOrDefault() method use karna hai.
5. Case-sensitive behaviour maintain karna hai.
Hint:
map.put(ch, map.getOrDefault(ch, 0) + 1);


getOrDefault(ch, 0) ka matlab: agar character map mein present hai toh uski existing frequency lo, otherwise 0 lo.

Tumhara task: Complete Java program likho. Is baar HashMap ka logic khud implement karna hai. 💪
*/
import java.util.*;

public class PracticeQ3 {
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
        HashMap<Character, Integer> mapName = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            mapName.put(ch, mapName.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mapName.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        input.close();
    }
}
