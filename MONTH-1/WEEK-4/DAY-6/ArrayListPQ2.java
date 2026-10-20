
/*
Next: PQ 2 — Find even numbers
Now solve the second problem using the same ArrayList knowledge.

Requirements:
1. Add 12, 7, 18, 5, 20, 9, 14 to an ArrayList<Integer>.
2. Use a for loop and get() to print only even numbers.
3. Count the even numbers and print the count.
*/
import java.util.*;

public class ArrayListPQ2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(20);
        numbers.add(9);
        numbers.add(14);
        int count = 0;
        System.out.print("Even Numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
                count++;
            }
        }
        System.out.println("\nCount of even numbers : " + count);
    }
}
