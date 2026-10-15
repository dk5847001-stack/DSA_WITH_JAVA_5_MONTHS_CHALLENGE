import java.util.Scanner;

class BankAccount {
    /*
     * Q4/5 — Encapsulation in Java
     * Goal: Learn how to protect data using private fields and public methods.
     * Your task
     * Create a BankAccount class with these requirements:
     * 1. Declare two private instance variables: accountHolder and balance.
     * 2. Create a constructor that initializes both variables.
     * 3. Create a public getter method for balance.
     * 4. Create a public method deposit(double amount) that adds money only when
     * the amount is greater than zero.
     * 5. Create a displayDetails() method that prints the account holder and
     * balance using the getter.
     * 6. In main(), create one account, deposit a positive amount, try depositing a
     * negative amount, and display the final details.
     */
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder : " + this.accountHolder);
        System.out.println("Balance : " + getBalance());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======= Welcome Account holder! =========");
        BankAccount b1 = new BankAccount("Dilkhush Kumar", 500.03);
        System.out.println("Enter 1 for check balance.");
        System.out.println("Enter 2 for deposit balance.");
        System.out.print("Enter token number : ");
        int n = input.nextInt();
        if (n == 1) {
            // System.out.println(b1.getBalance());
            // b1.deposit(100.50);
            // b1.deposit(-50.00);
            b1.displayDetails();
        } else if (n == 2) {
            System.out.print("Enter amount : ");
            double amount = input.nextDouble();
            b1.deposit(amount);
            b1.displayDetails();
        }
        input.close();
    }
}
