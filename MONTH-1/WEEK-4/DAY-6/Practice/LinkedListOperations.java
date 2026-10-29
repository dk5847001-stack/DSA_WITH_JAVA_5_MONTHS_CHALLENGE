package Practice;

import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Origional LinkedList : " + numbers);
        numbers.addFirst(100);
        numbers.addLast(200);
        System.out.println("Updated LinkedList : " + numbers);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing : " + numbers);
        numbers.remove(Integer.valueOf(20));
        System.out.println("Again after removing : " + numbers);

        // for loop....
        System.out.println("for loop...");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("\nInhance for loop...");
        // Inhance for loop....
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
