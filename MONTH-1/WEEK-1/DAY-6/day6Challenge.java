import java.util.Scanner;
public class day6Challenge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("====== ATM =======");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println();
        double balance = 0;
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Balance = " + balance + " $");
                break;
            case 2:
                System.out.print("Enter amount to deposit : ");
                double depositAmount = 
                break;
            case 3:
                System.out.println("Balance = " + balance + " $");
                break;
            case 4:
                System.out.println("Balance = " + balance + " $");
                break;
            
            default:
                System.out.println("Please enter a valid choice (1 to 4)!");
                break;    
        }
        input.close();
    }
}
