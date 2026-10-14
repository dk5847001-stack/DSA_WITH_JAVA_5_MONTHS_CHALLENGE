import java.util.Scanner;

public class Q2 {
    /*
     * Pichhle question ka next step hai. Ek program banao jo:
     * 1. User se String input le.
     * 2. concat(" Java") use kare.
     * 3. Original String print kare.
     * 4. Concatenation ka result bhi print kare.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String name = input.nextLine();
        name = name.trim();
        if (name.length() == 0) {
            System.out.println("String should not be empty!");
            input.close();
            return;
        }
        System.out.println(name);
        String newName = name.concat(" java");
        System.out.println(newName);
        input.close();
    }
}
