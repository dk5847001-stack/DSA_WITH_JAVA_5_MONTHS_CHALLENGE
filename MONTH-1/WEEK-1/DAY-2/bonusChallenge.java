public class bonusChallenge {
    /*
     * int a = 1_000_000;
     * int b = 1_000_000;
     * int c = 1_000_000;
     */
    public static void main(String[] args) {
        int byteValue = (int) Math.pow(2, 64) - 1;
        System.out.println(byteValue);

        int a = 1_000_000;
        int b = 1_000_000;
        int c = 1_000_000;
        long result = (long) a * b * c;
        long isSafe = byteValue - result;
        System.out.println(result);
        System.out.println(isSafe);
        if (isSafe > 0){
            System.out.println("Safe");
        }else{
            System.out.println("Not Safe");
        }
    }
}
