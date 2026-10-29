import java.util.*;
public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        System.out.println(marks);
        System.out.println(marks.get(1));
        marks.set(0, 100);
        System.out.println(marks);
        marks.remove(0);
        System.out.println(marks);

        for(int i = 0; i<marks.size(); i++){
            System.out.println(marks.get(i));
        }
        marks.add(40);
        marks.add(50);
        marks.add(50);
        System.out.println("----------");
        System.out.println(Integer.valueOf(150));
        System.out.println(marks);
        marks.remove(Integer.valueOf(40));
        System.out.println(marks);
    }
}
