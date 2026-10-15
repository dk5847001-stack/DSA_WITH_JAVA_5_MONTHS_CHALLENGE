
class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title : " + this.title);
        System.out.println("Price : " + this.price);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Science", 170.5);
        Book b2 = new Book("Arts", 230.5);

        System.out.println("Book 1");
        b1.displayDetails();
        System.out.println("\nBook 2");
        b2.displayDetails();
    }
}
