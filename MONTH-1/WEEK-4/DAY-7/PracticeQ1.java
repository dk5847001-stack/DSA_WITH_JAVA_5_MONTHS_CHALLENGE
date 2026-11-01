
/*
Q1. Reverse a String
Task: User se ek string input lo aur uska reverse print karo.

Example:
Input: ApnaAcademy
Output: ymedacAanpA

Conditions:

1. Scanner se input lena hai.
2. StringBuilder ka use karna hai.
3. Built-in reverse() method use kar sakte ho.
4. Original string ko bhi print karna hai.
   Expected output:
   Enter a string: ApnaAcademy

Original String: ApnaAcademy
Reversed String: ymedacAanpA
*/
import java.util.Scanner;

public class PracticeQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = input.nextLine();
        name = name.trim();
        if(name.length()==0){
            System.out.println("String should not be empty!");
            input.close();
            return;
        }
        StringBuilder namBuilder = new StringBuilder(name);
        System.out.println("Original String : "+namBuilder);
        System.out.println("Reversed String : "+namBuilder.reverse());
        input.close();
    }
}
