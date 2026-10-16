/*
9. Now you're ready for Q5/5 — Interfaces
Try this yourself. Use the concepts we just covered; don't copy the complete example above directly.
Task: Payment Interface
1. Create an interface named Payment with the method void pay(double amount);.
2. Create UPIPayment implementing Payment. It should print "Paid ₹<amount> using UPI.".
3. Create CardPayment implementing Payment. It should print "Paid ₹<amount> using Card.".
4. In main(), create one object of each class.
5. Call pay(500) on the UPI object and pay(1000) on the card object.
*/

interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card.");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();
        p1.pay(500);
        p2.pay(1000);
    }
}
