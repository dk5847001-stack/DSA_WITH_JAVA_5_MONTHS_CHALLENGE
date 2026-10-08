public class primeUsingMethod {
    static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrime(10));
        System.out.println(isPrime(11));
        System.out.println(isPrime(12));
    }
}
