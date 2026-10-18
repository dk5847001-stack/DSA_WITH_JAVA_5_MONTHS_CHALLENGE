public class StringParsing {
    public static void main(String[] args) {
        String text = "123";
        int number = Integer.parseInt(text);
        System.out.println(number+10);
        System.out.println(Double.parseDouble(text));
        System.out.println(Integer.valueOf(text));
    }
}
