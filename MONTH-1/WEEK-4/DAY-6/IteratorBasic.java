import java.util.ArrayList;
import java.util.Iterator;

public class IteratorBasic {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int number = it.next();
            if (number == 20) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
