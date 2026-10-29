/*
Task: Write a complete Java program that does the following:
1. Create an integer array:
   int[] numbers = {5, 10, 5, 20, 10, 5, 30};
2. Create a HashMap<Integer, Integer> named frequency.
3. Count how many times each number occurs using getOrDefault().
4. Print the final frequency map.
5. Print the frequency of 5 using frequency.get(5).
6. Print the frequency of 10 using frequency.get(10).
*/
package Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapQ2 {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 5, 20, 10, 5, 30 };
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            if (frequency.containsKey(number)) {
                frequency.put(number, frequency.getOrDefault(number, 0) + 1);
            } else {
                frequency.put(number, 1);
            }
        }
        System.out.println(frequency);
        System.out.println("frequency of 5 : " + frequency.get(5));
        System.out.println("frequency of 10 : " + frequency.get(10));
    }
}
