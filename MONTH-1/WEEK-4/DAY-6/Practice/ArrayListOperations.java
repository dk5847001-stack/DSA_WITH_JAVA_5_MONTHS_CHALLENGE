package Practice;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        System.out.println("Origional ArrayList = " + marks);
        marks.set(0, 100);
        System.out.println("After updaution, ArrayList = " + marks);
        System.out.println("Loop..........");
        for (int i = 0; i < marks.size(); i++) {
            System.out.print(marks.get(i) + " ");
        }
        marks.addLast(200);
        System.out.println("after add last element = " + marks);
        marks.addFirst(300);
        System.out.println("after add first element = " + marks);
        marks.remove(Integer.valueOf(20));
        System.out.println("After removing 20, ArrayList = " + marks);
        marks.remove(0);
        System.out.println("After removing first element = " + marks);
    }
}