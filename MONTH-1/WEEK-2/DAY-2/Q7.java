import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choise;
        do {
            System.out.println("============ MENU ============");
            System.out.println("1. Start");
            System.out.println("2. About");
            System.out.println("1. Exit");
            System.out.println();
            System.out.print("Enter your choise : ");
            choise = input.nextInt();
            switch(choise) {
                case 1:
                    System.out.println("You selected Start");
                    break;
                case 2:
                    System.out.println("You selected About");
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choise. Please try again.");
            }
        } while (choise != 3);
        System.out.println("you exited!");
        input.close();
    }
}
