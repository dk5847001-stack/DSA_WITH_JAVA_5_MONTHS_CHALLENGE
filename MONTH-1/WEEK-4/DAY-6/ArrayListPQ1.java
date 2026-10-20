/*
PQ 1 — Basic ArrayList Operations
Task: Write a Java program that:
1. Creates an ArrayList<Integer>.
2. Adds the numbers 10, 20, 30, 40, 50.
3. Prints the complete list.
4. Prints the element at index 2.
5. Updates the element at index 1 to 25.
6. Removes the element at index 3.
7. Prints the final list and its size.
*/
import java.util.*;
public class ArrayListPQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        numbers.set(1, 25);
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
