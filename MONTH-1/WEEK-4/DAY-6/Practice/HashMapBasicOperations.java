package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasicOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // add key value pair....
        students.put(101, "Dilkhush Kumar");
        students.put(102, "Roshan Kumar");
        students.put(103, "Pujesh Kumar");
        students.put(104, "Amar Kumar");
        students.put(105, "Rohit Kumar");

        // Print Map
        System.out.println("Origional Map : " + students);

        // update key-value pair......
        students.put(102, "Shivam Kumar");
        System.out.println("Updated Map : " + students);

        // access value using key.......
        System.out.println("access value using key : " + students.get(101));

        // Wether a key exists......
        System.out.println(students.containsKey(101));

        // Wether a value exists....
        System.out.println(students.containsValue("Dilkhush2 Kumar"));

        // remove key-value pair.......
        students.remove(102);
        System.out.println("Updated Map : " + students);

        // Traversal key using for loop.....
        System.out.println("Traversal key using for loop.....");
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // Traversal value using for loop.....
        System.out.println("Traversal key using for loop.....");
        for (String value : students.values()) {
            System.out.println(value);
        }

        // Traversal key-value pair using for loop.....
        System.out.println("Traversal key-value pair using for loop.....");
        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Traversal key-value pair using Map.....
        System.out.println("Traversal key-value pair using Map.....");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
