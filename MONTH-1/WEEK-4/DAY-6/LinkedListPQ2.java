/*
PQ 2 — Practice removing elements
Now apply what you've learned.

Requirements:
1. Create a LinkedList<Integer> containing 10, 20, 30, 40, 50.
2. Print the original list.
3. Remove the first element.
4. Remove the last element.
5. Remove the value 30 specifically, not an index.
6. Print the final list and its size.
*/

import java.util.*;
public class LinkedListPQ2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        numbers.removeFirst();
        numbers.removeLast();
        numbers.remove(Integer.valueOf(30));
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
