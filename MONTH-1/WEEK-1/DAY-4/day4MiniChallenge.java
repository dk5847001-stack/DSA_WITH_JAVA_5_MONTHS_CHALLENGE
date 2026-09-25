import java.util.*;
public class day4MiniChallenge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        System.out.print("Marks of three subjects : ");
        int sub1 = input.nextInt();
        int sum2 = input.nextInt();
        int sum3 = input.nextInt();
        int totalMarks = sub1 + sum2 + sum3;
        int avg = (sub1 + sum2 + sum3)/3;
        System.out.println("======= Studesnt Profile ========");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Marks : " + avg);
        System.out.println("===================================");
        input.close();
    }
}
