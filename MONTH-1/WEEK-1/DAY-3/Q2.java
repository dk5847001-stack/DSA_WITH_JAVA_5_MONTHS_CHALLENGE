public class Q2 {
    public static void main(String[] args) {
        // int x = 5; 
        // System.out.println(++x);
        // System.out.println(x);

        // int result = 10 + 5 * 2;
        // System.out.println(result);

        // int a = 10; 
        // System.out.println(a > 5 && a < 20);

        // int x = 10;
        // int y = x++;
        // System.out.println(x);
        // System.out.println(y);

        // int x = 5;
        // int y = ++x + x++;
        // System.out.println(x); // 7
        // System.out.println(y); // 12

        // int x = 5;
        // int y = --x + x--;
        // System.out.println(x); // 3
        // System.out.println(y); // 8

        int x = 5;
        int y = --x - x--;
        System.out.println(x); // 0
        System.out.println(y); // 0
    }
}