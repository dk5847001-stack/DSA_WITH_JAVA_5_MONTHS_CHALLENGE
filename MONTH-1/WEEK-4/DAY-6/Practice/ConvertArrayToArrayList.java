package Practice;

import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        ArrayList<Integer> marks = new ArrayList<>();
        System.out.print("Origional Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nArrayList       : ");
        for (int i = 0; i < arr.length; i++) {
            marks.add(arr[i]);
        }
        System.out.println(marks);

        marks.set(0, 100);
        System.out.println("After updation : " + marks);
        marks.addLast(200);
        marks.addFirst(300);
        marks.remove(2);
        marks.remove(Integer.valueOf(40));
        System.out.println("After multiple operations, ArrayList : " + marks);
        System.out.println("Size : " + marks.size());
        int count = 0;
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) > 30) {
                count++;
            }
        }
        System.out.println("Total count of marks who grater than 30 : " + count);
    }
}
