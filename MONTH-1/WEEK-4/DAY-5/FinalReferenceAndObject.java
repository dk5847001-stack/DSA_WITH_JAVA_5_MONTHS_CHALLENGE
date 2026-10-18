public class FinalReferenceAndObject {
    public static void main(String[] args) {
       final int[] arr = { 10, 20, 30 };
        System.out.println(arr[0]);
        arr[0] = 89;
        System.out.println(arr[0]);
        // arr = new int[] { 30, 40, 50 };
        // System.out.println(arr[0]);
    }
}
