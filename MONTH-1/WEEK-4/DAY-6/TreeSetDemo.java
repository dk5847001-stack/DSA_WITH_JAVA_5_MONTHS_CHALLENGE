import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<>();
        marks.add(10);
        marks.add(89);
        marks.add(78);
        marks.add(10);
        marks.add(90);
        System.out.println(marks);
        System.out.println(marks.descendingSet());
    }
}
