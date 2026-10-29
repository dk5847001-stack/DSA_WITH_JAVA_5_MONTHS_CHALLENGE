
/*
Iterator — Medium Level Practice Question
Problem: Remove all even numbers and print the sum of remaining odd numbers.

Ek ArrayList<Integer> diya hai:

[12, 7, 4, 9, 15, 8, 3, 10, 11]

Tumhe Java program likhna hai jo:
1. Iterator ka use karke list ke saare even numbers remove kare.
2. Original list ko update kare, nayi list mat banana.
3. Bache hue odd numbers ka sum calculate kare.
4. Final list aur sum print kare.
Expected output ka format:
Original list after removal: [...]
Sum of odd numbers: ...
*/
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPQ {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(4);
        numbers.add(9);
        numbers.add(15);
        numbers.add(8);
        numbers.add(3);
        numbers.add(10);
        numbers.add(11);
        System.out.println("Origional ArrayList : " + numbers);
        Iterator<Integer> it = numbers.iterator();
        int oddSum = 0;
        while (it.hasNext()) {
            int number = it.next();
            if (number % 2 == 0) {
                it.remove();
            } else {
                oddSum += number;
            }
        }
        System.out.println("Original list after removal: " + numbers);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
