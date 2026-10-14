import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String first = input.nextLine();
        first = first.trim();
        if (first.length() == 0) {
            System.out.print("String must not be empty!");
            input.close();
            return;
        }
        System.out.print("Enter second string : ");
        String second = input.nextLine();
        second = second.trim();
        if (second.length() == 0) {
            System.out.print("String must not be empty!");
            input.close();
            return;
        }
        System.out.println("First String : " + first);
        System.out.println("Second String : " + second);
        boolean isEqual = first.equals(second);
        if(isEqual){
            System.out.println("Content are equals of first and second string.");
        }else{
            System.out.println("Content are not equals of first and second string.");
        }
        int result = first.compareTo(second);
        System.out.println(result);
        if(result<0){
            System.out.println("first String lexicographically pehle aati hai.");
        }else if(result == 0){
            System.out.println("dono Strings equal hain.");
        }else{
            System.out.println("first String lexicographically baad mein aati hai.");
        }
        input.close();
    }
}
