
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("jva");
        System.out.println(name);

        // Insert element...
        name.insert(1, "a");
        System.out.println(name);

        // append ...
        name.append(" Dsa");
        name.append(" Course");
        System.out.println(name);

        // delete...
        name.delete(8, 15);
        System.out.println(name);

        // reverse...
        name.reverse();
        System.out.println(name);
    }
}

/*
 * Yaad rakho:
 * Feature String StringBuilder
 * Mutable? No Yes
 * Text add karna Naya result milta hai Existing object modify hota hai
 * Main method concat() append()
 * Insert/delete/reverse Directly nahi Available
 * Thread safety Immutable content Thread-safe nahi
 */
