import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("============= MENU =============");
            System.out.println("1. Starts");
            System.out.println("2. Settings");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice == 1) {
                System.out.println("You selected Starts");
            } else if (choice == 2) {
                System.out.println("You selected Settings");
            } else if (choice == 3) {
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        System.out.print("Program ended");

        input.close();
    }
}
