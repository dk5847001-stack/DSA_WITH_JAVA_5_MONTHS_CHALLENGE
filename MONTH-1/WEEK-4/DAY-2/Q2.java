import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = input.nextLine();
        name = name.trim();
        if (name.length() == 0) {
            System.out.println("String must not be empty!");
            input.close();
            return;
        }
        System.out.println(name);
        StringBuilder nameBuilder = new StringBuilder(name);
        System.out.print("Enter start index : ");
        int start = input.nextInt();
        if (start < 0 || start >= nameBuilder.length()) {
            System.out.println("Starting index must be between 0 and " + (nameBuilder.length() - 1));
            input.close();
            return;
        }
        System.out.print("Enter end index : ");
        int end = input.nextInt();
        if (end < 1 || end > nameBuilder.length()) {
            System.out.println("Ending index must be between 1 and " + nameBuilder.length());
            input.close();
            return;
        }
        if (end <= start) {
            System.out.println("Ending index must be greater than Starting index.");
            input.close();
            return;
        }
        nameBuilder.delete(start, end);
        System.out.println("Modified String : " + nameBuilder);
        System.out.println("reverse String : " + nameBuilder.reverse());
        input.close();
    }
}
