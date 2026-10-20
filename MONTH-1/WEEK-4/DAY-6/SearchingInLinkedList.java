import java.util.LinkedList;

public class SearchingInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        // Searching using loop.....
        int target = 820;
        boolean isFound = false;
        for (int number : numbers) {
            if (number == target) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);

        // Searching using contains()....
        if (numbers.contains(target)) {
            System.out.println(target + " found.");
        } else {
            System.out.println(target + " not found.");
        }
    }
}
