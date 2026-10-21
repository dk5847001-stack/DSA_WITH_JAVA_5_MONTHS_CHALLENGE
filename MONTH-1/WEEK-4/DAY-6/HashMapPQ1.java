/*
3. Practice Question — HashMap PQ1
Now apply what you've learned.

Write a complete Java program that:
1. Creates a HashMap<Integer, String> named students.
2. Adds these pairs: 1 → "Aman", 2 → "Riya", 3 → "Rahul".
3. Prints all key-value pairs using entrySet().
4. Updates key 2 to "Priya".
5. Prints the value associated with key 2.
6. Removes key 1.
7. Prints the final map and its size.*/

import java.util.*;

public class HashMapPQ1 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Rahul");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        students.put(2, "Priya");
        System.out.println(students.get(2));
        students.remove(1);
        System.out.println("updated students: " + students);
        System.out.println("size : " + students.size());
    }
}
