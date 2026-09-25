import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("====================================");
        System.out.println("Helo " + name + " your age is : " + age);
        System.out.println("====================================");
        input.close();
    }
}