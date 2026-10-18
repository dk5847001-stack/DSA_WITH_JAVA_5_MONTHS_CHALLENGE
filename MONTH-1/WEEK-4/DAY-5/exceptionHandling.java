
public class exceptionHandling {
    public static void main(String[] args) {
        int a = 20;
        int b = 4;
        try {
            int result = a / b;
            System.out.println("result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            System.out.println("Error : " + e);
        } 
            System.out.println("Calculator finished.");
    }
}
