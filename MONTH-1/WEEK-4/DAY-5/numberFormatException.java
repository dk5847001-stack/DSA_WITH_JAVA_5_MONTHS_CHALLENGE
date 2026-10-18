public class numberFormatException {
    public static void main(String[] args) {
        String value = "abc";
        try {
            int number = Integer.parseInt(value);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
        System.out.println("Program finished.");
    }
}
