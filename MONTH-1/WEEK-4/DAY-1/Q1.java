import java.util.Scanner;

public class Q1 {
    /*
     * Ek Java program banao jo user se ek String input le aur:
     * 1. String print kare.
     * 2. Uski length print kare.
     * 3. First aur last character print kare.
     * 4. User se start aur end indexes lekar substring(start, end) print kare
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String name = input.nextLine();
        name = name.trim();
        if (name.length() == 0) {
            System.out.println("String should not be empty!");
            input.close();
            return;
        }
        System.out.println(name);
        System.out.println("Length : " + name.length());
        System.out.println("First charactor : " + name.charAt(0));
        System.out.println("Last charactor : " + name.charAt(name.length() - 1));
        System.out.println("========= SUBSTRING PRINT =========");
        System.out.print("Enter starting index : ");
        int start = input.nextInt();
        if (start < 0 || start > name.length() - 1) {
            System.out.println("Starting index must be between 0 and " + (name.length() - 1));
            input.close();
            return;
        }
        System.out.print("Enter ending index : ");
        int end = input.nextInt();
        if (end < 1 || end > name.length()) {
            System.out.println("Ending index must be between 1 and " + (name.length()));
            input.close();
            return;
        }
        if (end <= start) {
            System.out.println("Ending index must be greater than starting index.");
            input.close();
            return;
        }
        System.out.println("Substring : " + name.substring(start, end));
        input.close();
    }
}
