import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Dilkhush Kumar");
        students.put(104, "Rahul Kumar");
        students.put(103, "Sonu Kumar");
        students.put(107, "Pujesh Kumar");
        students.put(104, "Amar Kumar");
        System.out.println(students);
        System.out.println(students.descendingMap());
    }
}
