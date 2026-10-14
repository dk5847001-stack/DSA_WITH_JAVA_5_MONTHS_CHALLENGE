import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = input.nextLine();
        name = name.trim();
        if (name.length() == 0) {
            System.out.println("String must not be empty!");
            input.close();
            return;
        }
        System.out.println(name);
        System.out.println("===== printing subString =====");
        System.out.print("Enter Starting inex : ");
        int start = input.nextInt();
        if (start < 0 || start >= name.length()) {
            System.out.println("Starting index must be between 0 and " + (name.length() - 1));
            input.close();
            return;
        }

        System.out.print("Enter Ending inex : ");
        int end = input.nextInt();
        if (end < 1 || end > name.length()) {
            System.out.println("Ending index must be between 1 and " + name.length());
            input.close();
            return;
        }

        if (end <= start) {
            System.out.println("Ending index must be greater than Starting index.");
            input.close();
            return;
        }
        System.out.println("Substring : " + name.substring(start, end));
        input.close();
    }
}
