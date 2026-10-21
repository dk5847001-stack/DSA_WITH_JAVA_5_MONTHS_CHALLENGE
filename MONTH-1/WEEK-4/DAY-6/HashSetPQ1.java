/*
PQ 1 — HashSet basics
Now that you've learned the concept and seen the code, try this question.

Requirements:
1. Create a HashSet<Integer> named numbers.
2. Add 10, 20, 10, 30, 20, 40.
3. Print the set.
4. Print its size.
5. Check whether it contains 30.
6. Remove 20.
7. Print the updated set and its size
*/

import java.util.HashSet;

public class HashSetPQ1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        System.out.println(numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Contains 30: " + numbers.contains(30));
        numbers.remove(20);
        System.out.println("Updated size: " + numbers.size());
    }
}
