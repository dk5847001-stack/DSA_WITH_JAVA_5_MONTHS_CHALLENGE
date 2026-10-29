import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Dilkhush", 75));
        students.add(new Student("Riya", 40));
        students.add(new Student("Rahul", 90));

        students.sort(Comparator.comparing(s -> s.name));

        System.out.println(students);
    }
}