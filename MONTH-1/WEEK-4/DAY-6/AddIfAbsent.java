import java.util.HashMap;
public class AddIfAbsent {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "null");
        students.putIfAbsent(101, "Dilkhush Kumar");
        students.putIfAbsent(102, "Rahul Kumar");
        System.out.println(students);
        students.replace(101, "Dilkhush");
        System.out.println(students);
        students.replace(101,  "Dilkhush", "Pujesh");
        System.out.println(students);
        students.remove(101, "Pujesh");
        System.out.println(students);
    }
}
