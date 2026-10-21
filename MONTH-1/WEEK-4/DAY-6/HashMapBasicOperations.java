import java.util.HashMap;
import java.util.Map;

public class HashMapBasicOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> Students = new HashMap<>();

        // Add key-value pairs...........
        Students.put(101, "Dilkhush");
        Students.put(102, "Rahul");
        Students.put(103, "Amar");
        Students.put(104, "Pujesh");
        Students.put(105, "Mithun");

        // Print the entire map..........
        System.out.println(Students);

        // Get the value using its key..........
        System.out.println(Students.get(101));

        // Check whether a key exists..........
        System.out.println(Students.containsKey(103));

        // Check whether a value exists..............
        System.out.println(Students.containsValue("mithun"));

        // Update the value for an existing key..........
        Students.put(102, "Raja");
        System.out.println("Updated Map: " + Students);

        // Remove a key-value pair
        Students.remove(101);
        System.out.println("After removing : " + Students);

        // Check size......
        System.out.println(Students.size());

        // Check is Map is empty.........
        System.out.println(Students.isEmpty());

        // Traversing only key...............
        System.out.println("\nTraversing only key.");
        for (Integer key : Students.keySet()) {
            System.out.println(key);
        }

        // Traversing only value..............
        System.out.println("\nTraversing only value.");
        for (String value : Students.values()) {
            System.out.println(value);
        }

        // Travering both key-value pair.......
        System.out.println("\nTravering both key-value pair");
        for (var entry : Students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Travering both key-value pair using Map.......
        System.out.println("\nTravering both key-value pair using Map");
        for (Map.Entry<Integer, String> entry : Students.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
