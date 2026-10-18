/*
Create a BankAccount class with:
- A private double balance field initialized to 1000.
- A public method getBalance() that returns the balance.
- A public method deposit(double amount) that adds money only if amount > 0.
- In main(), create an account, print its balance, deposit 500, and print the balance again.
*/
class BackAccount {
    private double balance = 1000;

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
}

public class BackAccountAccessModifires {
    public static void main(String[] args) {
        BackAccount b1 = new BackAccount();
        System.out.println(b1.getBalance());
        b1.deposit(500);
        System.out.println(b1.getBalance());
    }
}
