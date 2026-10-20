import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements..........
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        // Add the beginning and end elements.........
        numbers.addFirst(5);
        numbers.addLast(50);
        System.out.println(numbers);

        // Access the first and last elements........
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());

        // Remove the first and last element........
        numbers.removeFirst();
        numbers.removeLast();
        numbers.remove(Integer.valueOf(20));
        System.out.println(numbers);

        // Size of LinkedList.......
        System.out.println(numbers.size());
        
        // print element using loop.........
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Enhance for loop.....
        System.out.print("Enhance for loop : ");
        for(int number : numbers){
            System.out.print(number+" ");
        }
    }
}
