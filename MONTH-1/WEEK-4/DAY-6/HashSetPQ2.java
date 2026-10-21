
/*
4. Practice Question — HashSet PQ2
Now write a Java program that:
1. Creates a HashSet<Integer> named numbers.
2. Adds 5, 10, 15, 20, 25.
3. Prints every element using an enhanced for loop.
4. Counts how many elements are greater than 10.
5. Prints the final count.
*/
import java.util.HashSet;

public class HashSetPQ2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(15);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(25);
        int count = 0;
        for (int number : numbers) {
            System.out.print(number + " ");
            if (number > 10) {
                count++;
            }
        }
        System.out.println("\ncount: " + count);
    }
}
