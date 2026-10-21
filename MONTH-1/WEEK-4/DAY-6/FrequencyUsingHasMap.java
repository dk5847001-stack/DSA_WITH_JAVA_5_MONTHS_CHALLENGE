import java.util.*;

public class FrequencyUsingHasMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int[] numbers = { 10, 20, 10, 30, 20, 40, 30, 50 };
        // for (int number : numbers) {
        //     if (frequency.containsKey(number)) {
        //         frequency.put(number, frequency.get(number) + 1);
        //     } else {
        //         frequency.put(number, 1);
        //     }
        // }
        for (int number : numbers) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.getOrDefault(number, 0) + 1);
            } else {
                frequency.put(number, 1);
            }
        }
        System.out.println(frequency);
    }
}
