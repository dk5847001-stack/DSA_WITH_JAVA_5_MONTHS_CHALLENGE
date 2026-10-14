import java.util.Scanner;

public class Q3 {
    /*
     * Ab ek program banao jo user se String input le aur user ke diye hue index par
     * character print kare.
     * Requirements:
     * 1. String input lo.
     * 2. Index input lo.
     * 3. Agar String empty ho, toh handle karo.
     * 4. Agar index invalid ho (index < 0 ya index >= length), toh error message
     * print karo.
     * 5. Valid index ho toh us character ko print karo.
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
        System.out.print("Enter an index, you want to print : ");
        int idx = input.nextInt();
        if (idx < 0 || idx > name.length()-1) {
            System.out.println("Index must be between 0 and " + (name.length()-1));
            input.close();
            return;
        }
        System.out.println(name.charAt(idx));
        input.close();
    }
}
