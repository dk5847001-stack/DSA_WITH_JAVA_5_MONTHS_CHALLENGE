package Practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingHashMap {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 10, 10, 20, 40, 30, 50 };
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.getOrDefault(number, 0) + 1);
            } else {
                frequency.put(number, 1);
            }
        }
        System.out.println(frequency);
        System.out.println("\n=======================");
        System.out.println("value   ->  frequency");
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(" " + entry.getKey() + "     ->     " + entry.getValue());
        }
        System.out.println("=======================");
    }
}
