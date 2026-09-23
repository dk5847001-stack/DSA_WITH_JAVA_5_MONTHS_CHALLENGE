public class finalVariable {
    public static void main(String[] args){
        final int number = 10; // final variable cannot be reassigned
        // number = 20; // This line would cause a compilation error
        System.out.println(number);
    }
}