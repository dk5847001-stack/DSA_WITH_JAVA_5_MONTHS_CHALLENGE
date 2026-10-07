    import java.util.Scanner;

    public class problem6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int n = input.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("total factors : " + count);
            input.close();
        }
    }
