import java.util.Scanner;

public class day5MiniChallenge {
    /*
     * 0–100 → ₹5 per unit
     * 101–200 → ₹7 per unit
     * 201–300 → ₹10 per unit
     * above 300 → ₹15 per unit
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unit = input.nextInt();
        if(unit > 300) {
            System.out.println("The total bil is : " + unit + " X " + 15 + " = " + (unit * 15));
        }else if(unit > 200) {
            System.out.println("The total bil is : " + unit + " X " + 10 + " = " + (unit * 10));
        }else if(unit > 100) {
            System.out.println("The total bil is : " + unit + " X " + 7 + " = " + (unit * 7));
        }else if(unit >= 0) {
            System.out.println("The total bil is : " + unit + " X " + 5 + " = " + (unit * 5));
        }else{
            System.out.println("Invalid input");
        }
        input.close();
    }
}
