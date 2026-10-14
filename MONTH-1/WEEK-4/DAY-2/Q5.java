import java.util.Scanner;

public class Q5 {
    /*
     * Q5/5 — Final challenge: StringBuilder methods combine karo
     * Ek program banao jo:
     * 1. User se string input le.
     * 2. String ko StringBuilder mein convert kare.
     * 3. User se ek word input le aur string ke end mein append kare.
     * 4. User se ek index aur character input le; us index par character insert
     * kare.
     * 5. User se start aur end indexes lekar range delete kare.
     * 6. Final string print kare.
     */
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

        System.out.println("======= APPEND ========");
        System.out.print("Enter a word : ");
        String word = input.next();
        System.out.println(nameBuilder.append(" " + word));

        System.out.println("======= INSERT ========");
        System.out.print("Enter index : ");
        int idx = input.nextInt();
        if (idx < 0 || idx > nameBuilder.length()) {
            System.out.println("index must be between 0 and " + nameBuilder.length());
            input.close();
            return;
        }
        System.out.print("Enter a charactor : ");
        char insertWord = input.next().charAt(0);
        System.out.println(nameBuilder.insert(idx, insertWord));

        System.out.println("======= DELETE ========");
        System.out.print("Enter start index : ");
        int start = input.nextInt();
        if (start < 0 || start >= nameBuilder.length()) {
            System.out.println("Start index must be between 0 and " + (nameBuilder.length() - 1));
            input.close();
            return;
        }

        System.out.print("Enter end index : ");
        int end = input.nextInt();
        if (end < 1 || end > nameBuilder.length()) {
            System.out.println("End index must be between 1 and " + nameBuilder.length());
            input.close();
            return;
        }
        if (end <=start) {
            System.out.println("End index must be greater than start index.");
            input.close();
            return;
        }
        System.out.println(nameBuilder.delete(start, end));
        input.close();
    }
}
