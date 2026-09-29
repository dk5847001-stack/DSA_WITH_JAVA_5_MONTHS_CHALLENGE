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
        double balance = 500;
        System.out.print("Enter your choice : ");
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Balance = " + balance + " $");
                break;
            case 2:
                System.out.print("Enter amount to deposit : ");
                double depositAmount = input.nextDouble();
                balance += depositAmount;
                System.out.println("New Balance = " + balance);
                break;
            case 3:
                System.out.print("Enter amount to withdraw : ");
                double withdrawAmount = input.nextDouble();
                if(withdrawAmount > balance) {
                    System.out.println("Insufficient balance!");
                }else{
                    balance -= withdrawAmount;
                    System.out.println("Successfully Withdrawn Amount = " + withdrawAmount);
                    System.out.println("New Balance = " + balance);
                }
                break;
            case 4:
                System.out.println("you have exited the ATM. Thank you for using our service!");
                break;
            
            default:
                System.out.println("Please enter a valid choice (1 to 4)!");
                break;    
        }
        input.close();
    }
}
