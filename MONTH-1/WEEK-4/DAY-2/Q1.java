import java.util.Scanner;

public class Q1 {
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
        StringBuilder Name = new StringBuilder(name);
        System.out.print("Enter a word, you want to add to end of the string : ");
        String word = input.nextLine();
        Name.append(" " + word);
        System.out.println("New String : " + Name);
        System.out.print("Enter an index : ");
        int idx = input.nextInt();
        if (idx < 0 || idx > Name.length()) {
            System.out.println("Index must be between 0 and " + Name.length());
            input.close();
            return;
        }
        input.nextLine();
        System.out.print("Enter a word, you want to insert : ");
        String insertWord = input.nextLine();
        Name.insert(idx, insertWord);
        System.out.println("Final String : " + Name);
        input.close();
    }
}
