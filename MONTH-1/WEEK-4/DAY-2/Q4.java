import java.util.Scanner;

public class Q4 {
    /*
     * Q4/5 — StringBuilder challenge
     * Ab ek naya program banao:
     * 1. User se string input lo.
     * 2. StringBuilder banao.
     * 3. User se ek character input lo.
     * 4. String mein us character ki total occurrences count karo.
     * 5. Count print karo, aur original string unchanged rehni chahiye.
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
        System.out.print("Enter a charactor : ");
        char ch = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < nameBuilder.length(); i++) {
            if (nameBuilder.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences : " + count);
        System.out.println(name);
        System.out.println(nameBuilder);
        input.close();
    }
}
