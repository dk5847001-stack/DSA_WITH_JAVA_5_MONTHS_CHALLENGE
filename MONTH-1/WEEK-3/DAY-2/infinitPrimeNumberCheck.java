import java.util.Scanner;

public class infinitPrimeNumberCheck {
    static void isPrime(int a) {
        boolean isPrime = true;
        if (a < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(a + " is a prime number.");
        }else{
            System.out.println(a + " is not a prime number.");
        }
        System.out.println();
        input();
    }

    static void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        isPrime(n);
        input.close();
    }

    public static void main(String[] args) {
        input();
    }
}
